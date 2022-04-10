package com.sparshorg.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {
    Button b1,b2;
    MediaPlayer mp,mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        b1=findViewById(R.id.but4);
        b2=findViewById(R.id.but5);
        MediaPlayer mp=new MediaPlayer().create(Music.this,R.raw.apashe);
        MediaPlayer mp1=new MediaPlayer().create(Music.this,R.raw.sound);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying())
                {
                    mp1.stop();
                }
                else {
                    mp.start();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                else {
                    mp1.start();
                }
            }
        });


    }
}