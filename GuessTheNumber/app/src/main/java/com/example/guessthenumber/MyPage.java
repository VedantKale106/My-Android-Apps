package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MyPage extends AppCompatActivity {

    MediaPlayer player;
    public void gayyy()
    {
        if(player == null) {
            player = MediaPlayer.create(this, R.raw.my);
        }
        player.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);
        gayyy();
    }
}