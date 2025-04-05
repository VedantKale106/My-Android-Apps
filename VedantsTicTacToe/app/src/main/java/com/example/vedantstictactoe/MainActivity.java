    package com.example.vedantstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void playButton(View view){
        Intent intent = new Intent(this , PlayerSetup.class);
        startActivity(intent);
        MediaPlayer button = MediaPlayer.create(this , R.raw.button);
        button.start();
    }
    public void myPage(View view){
            Intent intent = new Intent(this , MyPage.class);
            startActivity(intent);
        MediaPlayer button = MediaPlayer.create(this , R.raw.button);
        button.start();
        }
}