package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewExample extends AppCompatActivity {
ListView listView;
String [] myMobilesList={"xperia","Note","Nokia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        listView=findViewById(R.id.mylistview);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                myMobilesList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ListViewExample.this, "on"+position+"clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
