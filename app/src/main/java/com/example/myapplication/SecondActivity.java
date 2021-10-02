package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        Intent intent = getIntent();
//        String Value= intent.getStringExtra("key");
//        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        textview = findViewById(R.id.edttxt2);
        Intent intent = getIntent();
        String Value  = intent.getStringExtra("key");
        textview.setText(Value);

    }
}