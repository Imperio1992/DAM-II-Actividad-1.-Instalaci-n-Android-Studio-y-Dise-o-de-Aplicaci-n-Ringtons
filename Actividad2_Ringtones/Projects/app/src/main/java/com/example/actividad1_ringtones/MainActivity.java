package com.example.actividad1_ringtones;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Agregar animaciones: de arriba a abajo
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriva);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriva);

        //Agregar animaciones: de abajo a arriba
        // Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        // Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView audiotextview = findViewById(R.id.audiotextview);
        ImageView logoimageview = findViewById(R.id.logoimageview);

        audiotextview.setAnimation(animacion1);
        logoimageview.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);
    }
}