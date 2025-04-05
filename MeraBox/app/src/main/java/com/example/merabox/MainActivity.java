package com.example.merabox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("1") && password.getText().toString().equals("1")) {

                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent book = new Intent(MainActivity.this , Category.class);
                    startActivity(book);
                } else if (username.getText().toString().equals("Harsh69") && password.getText().toString().equals("6969")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent book = new Intent(MainActivity.this , Category.class);
                    startActivity(book);
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}