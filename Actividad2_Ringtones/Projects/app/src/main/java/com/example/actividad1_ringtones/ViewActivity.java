package com.example.actividad1_ringtones;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class ViewActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5;
    Button share1, share2, share3, share4, share5;
    Button blue1, blue2, blue3, blue4, blue5;
    MediaPlayer mp1, mp2, mp3, mp4, mp5;


    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        blue1 = findViewById(R.id.blue1);
        blue2 = findViewById(R.id.blue2);
        blue3 = findViewById(R.id.blue3);
        blue4 = findViewById(R.id.blue4);
        blue5 = findViewById(R.id.blue5);

            share1 = findViewById(R.id.share1);
            share2 = findViewById(R.id.share2);
            share3 = findViewById(R.id.share3);
            share4 = findViewById(R.id.share4);
            share5 = findViewById(R.id.share5);

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

        // Configura el Reproducir
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

        // Configura del boton de Compartir
        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        // Botón blue1
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });

        // Botón blue
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });

        blue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });

        blue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });

        blue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("Muchas Felicidades, has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas.")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); // Finaliza la actividad actual
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel(); // Cierra el diálogo
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("FELICIDADES!!!");
                titulo.show();
            }
        });


    }
}