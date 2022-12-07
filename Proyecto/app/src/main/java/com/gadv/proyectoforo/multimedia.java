package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class multimedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);


    }
    public void mediaPlayer(View view){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.navidad);
        mp.start();

    }
}