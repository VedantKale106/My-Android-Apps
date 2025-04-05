package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView user , pass ;
    Button login ;
    public static final String extraName = "com.example.multiview.extra.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.userName);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.login);
        Intent next = new Intent(MainActivity.this , MainActivity3.class);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String U = user.getText().toString() ;
                String P = pass.getText().toString() ;
                if(U.equals("vedant")&& P.equals("kale")) {
                    next.putExtra(extraName, U);
                    startActivity(next);
                } else if (U.equals("") || P.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Username and Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}