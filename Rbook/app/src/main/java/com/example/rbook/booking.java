package com.example.rbook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class booking extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
 ImageButton myPage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Spinner spinner = findViewById(R.id.boobSize);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this , R.array.size, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        myPage = findViewById(R.id.myPage);
        myPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyPage();
            }


        });
    }

    private void openMyPage() {
        Intent intent = new Intent(this , Developers_page.class);
        startActivity(intent);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}