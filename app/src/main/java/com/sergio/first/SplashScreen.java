package com.sergio.first;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView imagen;
        super.onCreate(savedInstanceState);
        openApp(true);
        setContentView(R.layout.activity_splash_screen);
        imagen = (ImageView) findViewById(R.id.logo);

        Animation fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        imagen.startAnimation(fadein);
    }

    private void openApp(boolean locationPermission) {

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);


    }
}
