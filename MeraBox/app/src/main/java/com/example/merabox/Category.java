package com.example.merabox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    Button desi;
    Button videsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        desi=findViewById(R.id.desi);
        videsi=findViewById(R.id.videsi);



        desi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desi = new Intent(Category.this, Desi.class);
                startActivity(desi);
            }
        });
        videsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videsi = new Intent(Category.this, Videsi.class);
                startActivity(videsi);
            }
        });
    }
}