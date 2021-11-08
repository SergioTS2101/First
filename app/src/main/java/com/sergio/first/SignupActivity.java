package com.sergio.first;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SignupActivity extends AppCompatActivity {
    EditText txt_nombre,txt_usuario, txt_contraseña;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txt_nombre=(EditText)findViewById(R.id.txtNombre);
        txt_usuario=(EditText)findViewById(R.id.editText2);
        txt_contraseña=(EditText)findViewById(R.id.txtPassword);

        entrar=(Button)findViewById(R.id.button);

        ImageView mixiGirl =findViewById(R.id.mixi);


    }
}
