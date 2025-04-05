package com.example.multiview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name ;

    public static final String extraName = "com.example.multiview.extra.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View v)
    {
        //Toast.makeText(this, "Thanks For Submitting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , MainActivity2.class );


        name = findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent.putExtra(extraName , nameText);
        startActivity(intent);

    }
}