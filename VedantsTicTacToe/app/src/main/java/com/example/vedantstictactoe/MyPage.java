package com.example.vedantstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);
        MediaPlayer myPage = MediaPlayer.create(this , R.raw.mypage);
        myPage.start();
    }
}