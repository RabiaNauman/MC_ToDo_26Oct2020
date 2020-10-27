package com.example.mc_todo_26oct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b=getIntent().getExtras();
        ArrayList<String> arraylist=b.getStringArrayList("array");
        ListView listview=findViewById(R.id.listview);
        ArrayAdapter<String> items=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraylist);
        listview.setAdapter(items);
    }
}