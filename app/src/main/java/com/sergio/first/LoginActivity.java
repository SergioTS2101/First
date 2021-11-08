package com.sergio.first;

import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * @author Sergio Tomeo Samuel
 */
public class LoginActivity extends AppCompatActivity {
    //EditText txt_usuario, txt_contraseña;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //txt_usuario = (EditText)findViewById(R.id.username);
        //txt_contraseña = (EditText)findViewById(R.id.txtPassword);
        entrar = (Button)findViewById(R.id.button);

        ImageView mixiPh =findViewById(R.id.mixi);

        Glide.with(this)

                .load(R.drawable.mixiiiiii)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.purple_500)))
                .into(mixiPh);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String usuario = txt_usuario.getText().toString();
                //String contraseña = txt_contraseña.getText().toString();
               // if(usuario.equals("sergiots2101") && contraseña.equals("123456")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                //}else{
                  //  Toast.makeText(getApplicationContext(),"Usuario o contraseña erróneos",Toast.LENGTH_SHORT);
                //}
            }
        });
    }


    public void onClickSign(View v) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

}