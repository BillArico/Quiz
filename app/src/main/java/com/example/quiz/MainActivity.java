package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton Answer1, Answer2, Answer3, Answer4;
    Button button;
    TextView Score, Questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        Questions = (TextView) findViewById(R.id.Question);
        Score = (TextView) findViewById(R.id.Score);

        Answer1 = (RadioButton) findViewById(R.id.Answer1);
        Answer2 = (RadioButton) findViewById(R.id.Answer2);
        Answer3 = (RadioButton) findViewById(R.id.Answer3);
        Answer4 = (RadioButton) findViewById(R.id.Answer4);

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}