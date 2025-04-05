package com.example.vedantstictactoe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayGround extends AppCompatActivity {

    private Board board;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ground);

        Button playAgainBTN = findViewById(R.id.play);
        Button homeBTN = findViewById(R.id.home);
        TextView playerTurn = findViewById(R.id.textView2);
        playAgainBTN.setVisibility(View.GONE);
        homeBTN.setVisibility(View.GONE);
        String[] playerNames = getIntent().getStringArrayExtra("Player_Names");

        if (playerNames != null)
        {
            playerTurn.setText((playerNames[0] + "'s Turn"));
            MediaPlayer game = MediaPlayer.create(this , R.raw.gamebg);
            game.start();
        }

        board = findViewById(R.id.board);
        board.setUpGame(playAgainBTN ,homeBTN , playerTurn , playerNames);


    }
public void playAgain(View view){
board.resetGame();
board.invalidate();
    MediaPlayer button = MediaPlayer.create(this , R.raw.button);
    button.start();
}

public void home(View view){
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    MediaPlayer button = MediaPlayer.create(this , R.raw.button);
    button.start();
    }

}