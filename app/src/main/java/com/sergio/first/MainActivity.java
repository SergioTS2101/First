package com.sergio.first;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;
    private WebView miVisorWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView mycontext = (TextView) findViewById(R.id.textTap);
        // registerForContextMenu(mycontext);

        // casting a la vista a la que aplicamos un menu contextual
        // y la registramos
        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);


        // DENTRO del Oncreate
        // cast al Layout SwipeRefresh con el que rodeamos la vista
        // en el xml y le colocamos un listener
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        //La vista dentro es un webview con permiso para zoom
        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
        //  miVisorWeb.getSettings().setJavaScriptEnabled(true);
        miVisorWeb.getSettings().setBuiltInZoomControls(true);
        miVisorWeb.loadUrl("https://www.thisautomobiledoesnotexist.com/");


    }

    // FUERA del Oncreate
    // construimos el Listener que lanza un Toast y desactiva a
    // continuación del Swipe la animación

    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {


            Toast toast0 = Toast.makeText(MainActivity.this, "Imagen actualizada", Toast.LENGTH_LONG);
            toast0.show();
            miVisorWeb.reload();
            swipeLayout.setRefreshing(false);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);

    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:

                ConstraintLayout mLayout =  findViewById(R.id.myMainConstraint);

                Snackbar snackbar = Snackbar
                        .make(mLayout, "El texto ha sido añadido al portapapeles", Snackbar.LENGTH_LONG)
                        .setAction("DESHACER", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();


                return true;

            case R.id.item2:
                mLayout=findViewById(R.id.myMainConstraint);
                Snackbar snackbar2 = Snackbar
                        .make(mLayout, "La imagen ha sido añadida a descargas", Snackbar.LENGTH_LONG)
                        .setAction("DESHACER", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar2.show();
                return true;
            case R.id.item4:
                startActivity(new Intent(this, SignupActivity.class));
                ;

            default:

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                onCreateD(MainActivity.this);
                return true;
           case R.id.item2:
               onCreateDialog(MainActivity.this);
             //   startActivity(new Intent(this, SplashScreen.class));
                return true;
            case R.id.item3:
                startActivity(new Intent(this, AboutUsActivity.class));
                return true;
            case R.id.item4:
                startActivity(new Intent(this, SignupActivity.class));
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    public void onCreateD (MainActivity view){
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
         builder.setTitle("Atención");
         builder.setMessage("¿Desea volver al Login?");
         //builder.setView(getLayoutInflater().inflate(R.layout.alertdialog_view, null));


         builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        dialog.dismiss();
        }
        });
         builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        }
        });

         builder.setNeutralButton("Quizás más tarde", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        }
        });
         AlertDialog dialog = builder.create();
         dialog.show();
    }

    public void onCreateDialog (MainActivity view){

        String [] array = new String[3];
        array[0]="sergiots2101@gmail.com";
        array[1]="sertomeo@ucm.es";
        array[2]="mtomeo@ucm.es";

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Seleccione un correo");
        alertDialog.setItems(array, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();

    }


}