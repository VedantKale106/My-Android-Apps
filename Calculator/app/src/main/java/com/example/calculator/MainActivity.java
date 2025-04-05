package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1 , n2 ;
    TextView text ;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        text = findViewById(R.id.text);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sum = (double) (Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString()));
                text.setText("The Sum is : " + sum );
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double diff = (double) (Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString()));
                text.setText("The Substraction is : " + diff );
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double multi = (double) (Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString()));
                text.setText("The Multiplication is : " + multi );
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double div = (double) (Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString()));
                Double rem = (double) (Integer.parseInt(n1.getText().toString()) % Integer.parseInt(n2.getText().toString()));
                text.setText("The Quotient is : " + div + " & The Remainder is :" + rem);
            }
        });

    }
}