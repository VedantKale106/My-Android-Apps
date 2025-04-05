package com.example.guessthenumber;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button check ;
    Button restart ;
    Button myPage ;
    EditText guess ;
    TextView textView ;
    int ch = 6 ;
    int chance = ch ;
    int permit = 0;

    public static void generateRandom() {
        int min = 1;
        int max = 100;
        Random r = new Random();
        int randomNumber = r.nextInt(max - min + 1) + min;
    }
    MediaPlayer player;
    public void won()
    {
        if(player == null)
        {
            player = MediaPlayer.create(this , R.raw.ahh);
        }
        player.start();
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.check);
        guess = findViewById(R.id.guess);
        textView = findViewById(R.id.answer);
        myPage = findViewById(R.id.myPage);
        restart = findViewById(R.id.restart);


        int min = 1;
        int max = 100;
        Random r = new Random();
        int randomNumber = r.nextInt(max - min + 1) + min;




        myPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (permit == 1) {
                    Intent i = new Intent(getApplicationContext(), MyPage.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "You Need to Win The Game to access Developer's page", Toast.LENGTH_SHORT).show();
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
                overridePendingTransition(0,0);

            }
        });



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answer = Integer.parseInt(guess.getText().toString());
                if(answer == randomNumber)
                {
                    textView.setText("Sahi Khel Gaya Bhencho 🍾");
                    Toast.makeText(MainActivity.this, "Congratulations You Won !! , Now you can access Developer's Page", Toast.LENGTH_SHORT).show();
                    won();
                    permit++;

                }
                else if(answer > randomNumber)
                {
                    textView.setText("Too Bigg Daddy 😣");
                    chance-- ;
                    Toast.makeText(MainActivity.this, "You have "+ chance + " chances left !!", Toast.LENGTH_SHORT).show();
                    if(chance<=0)
                    {
                        Intent j = new Intent(getApplicationContext(), Lost.class);
                        startActivity(j);
                    }
                }
                else if(answer < randomNumber)
                {
                    textView.setText("Bhaut Chota Hein Bhai Tera 🤏");
                    chance-- ;
                    Toast.makeText(MainActivity.this, "You have "+ chance + " chances left !!", Toast.LENGTH_SHORT).show();
                    if(chance<=0)
                    {
                        Intent j = new Intent(getApplicationContext(), Lost.class);
                        startActivity(j);
                    }
                }


            }
        }

        );
    }
}