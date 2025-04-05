package com.example.vedantstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    EditText name1 , name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);

    }
    public void playGround(View view) {

        String player1 = name1.getText().toString();
        String player2 = name2.getText().toString();
        MediaPlayer button = MediaPlayer.create(this , R.raw.button);
        button.start();

        Intent intent = new Intent(this, PlayGround.class);
        intent.putExtra("Player_Names" , new String[] {player1 , player2});
        startActivity(intent);
    }
}