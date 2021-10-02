package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button2;
    Button button;
    Button button3;
    TextView textView;
    EditText editText;
    String Value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button=findViewById(R.id.btn1);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        editText=findViewById(R.id.edttxt2);
        textView=findViewById(R.id.txt1);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(this, "first btn", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
            Toast.makeText(this, "second btn", Toast.LENGTH_SHORT).show();
            break;
            case R.id.btn3:
                Intent intent=new Intent(this,SecondActivity.class);
                Value = editText.getText().toString();
                intent.putExtra("key",Value);
                startActivity(intent);
        }
    }

}