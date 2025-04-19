package com.example.actividad1_ringtones;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ViewActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5;
    MediaPlayer mp1, mp2, mp3, mp4, mp5;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            play1 = (Button) findViewById(R.id.play1);
            play2 = (Button) findViewById(R.id.play2);
            play3 = (Button) findViewById(R.id.play3);
            play4 = (Button) findViewById(R.id.play4);
            play5 = (Button) findViewById(R.id.play5);

            mp1 = MediaPlayer.create(this, R.raw.a_mover_el_bote);
            mp2 = MediaPlayer.create(this, R.raw.bella_por_fuera_y_por_dentro);
            mp3 = MediaPlayer.create(this, R.raw.borrachera);
            mp4 = MediaPlayer.create(this, R.raw.chale);
            mp5 = MediaPlayer.create(this, R.raw.de_los_viejos_a_etchojoa);


            play1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mp1.isPlaying()) {
                        mp1.pause();
                        Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                    } else {
                        mp1.start();
                        Toast.makeText(ViewActivity.this, "Reproduciendo: A Mover El Bote", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            play2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mp2.isPlaying()) {
                        mp2.pause();
                        Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                    } else {
                        mp2.start();
                        Toast.makeText(ViewActivity.this, "Reproduciendo: Bella Por Fuera Y Por Dentro", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            play3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mp3.isPlaying()) {
                        mp3.pause();
                        Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                    } else {
                        mp3.start();
                        Toast.makeText(ViewActivity.this, "Reproduciendo: Borrachera", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            play4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mp4.isPlaying()) {
                        mp4.pause();
                        Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                    } else {
                        mp4.start();
                        Toast.makeText(ViewActivity.this, "Reproduciendo: Chale", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            play5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mp5.isPlaying()) {
                        mp5.pause();
                        Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                    } else {
                        mp5.start();
                        Toast.makeText(ViewActivity.this, "Reproduciendo: De Los Viejos A Etchojoa", Toast.LENGTH_SHORT).show();
                    }
                }
            });


// Puedes agregar eventos similares para play3, play4 y play5.




        }
}