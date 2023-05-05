package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String lista;
    Button buttonProximo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void proxime(View v){


        Intent compras = new Intent(MainActivity.this,Compras.class);
        startActivity(compras);
    }

    public void alerta(String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage(msg);
        alert.setTitle("Alerta");
        alert.setNeutralButton("OK",null);
        alert.show();


    }
}