package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ToggleButton t ;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this , R.raw.b);
        mp.start();
        t = findViewById(R.id.playPause);
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(t.isChecked())
                {
                    mp.pause();
                } else if (!t.isChecked()) {
                    mp.start();
                }
            }
        });



    }
}