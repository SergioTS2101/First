package com.sergio.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * @author Sergio Tomeo Samuel
 * @author Marcosmartin16 ATR
 */
public class LoginActivity extends AppCompatActivity {
    //EditText txt_usuario, txt_contraseña;
    Button entrar;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //txt_usuario = (EditText)findViewById(R.id.username);
        //txt_contraseña = (EditText)findViewById(R.id.txtPassword);
        entrar = (Button)findViewById(R.id.button);
        volver = (Button)findViewById(R.id.buttoninverso);
        ImageView logo = findViewById(R.id.logo);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        logo.startAnimation(rotate);

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

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
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