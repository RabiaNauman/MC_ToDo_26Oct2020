package com.example.mc_todo_26oct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PassList(View v)
    {
        EditText t1 =findViewById(R.id.textBox1);
        EditText t2 =findViewById(R.id.textBox2);
        EditText t3 =findViewById(R.id.textBox3);
        ListView lv=findViewById(R.id.listview);
        ArrayList<String> StringArray=new ArrayList<String>();

        if(TextUtils.isEmpty(t1.getText().toString()))
        {
        }
        else
        {
            StringArray.add("Name is " + t1.getText().toString());
        }
        if(TextUtils.isEmpty(t2.getText().toString()))
        {
        }
        else
        {
            StringArray.add("Roll number is " + t2.getText().toString());
        }
        if(TextUtils.isEmpty(t3.getText().toString()))
        {
        }
        else
        {
            StringArray.add("Email is " + t3.getText().toString());
        }
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("array",StringArray);
        startActivity(i);
    }
}