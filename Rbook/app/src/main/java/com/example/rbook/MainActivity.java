package com.example.rbook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button book ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button = findViewById(R.id.myPage);
        book = findViewById(R.id.bookNow);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookingPage();
            }
        });
    }

    private void openBookingPage() {
        Intent intent = new Intent(this , booking.class);
        startActivity(intent);
    }


}