package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {
    ListView listView;
    String listadeCompras,produto,quantidade;
    ArrayList comprar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        Intent i = getIntent();
        comprar = i.getCharSequenceArrayListExtra("comprar");

        listView = findViewById(R.id.listViewListar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,comprar);
        listView.setAdapter(adapter);

    }



}
