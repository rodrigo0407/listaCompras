package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Compras extends AppCompatActivity {
    double  quantidade,compras;
    EditText edtProduto,edtQuantidade;
    Button buttonSalvar, buttonVisualizar;
    String lista,produto;

    ArrayList<String> comprar = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        Intent lista = getIntent();
        Bundle b = lista.getExtras();
        edtProduto = findViewById(R.id.editTextProduto);
        edtQuantidade = findViewById(R.id.editTextQuantidade);
        buttonSalvar = findViewById(R.id.buttonSalvar);


    }
    public void salvar(View v){

        if(edtProduto.getText().toString().equals("")){
            alerta("Preencha o campo Produto");
            edtProduto.requestFocus();
        }else if(edtQuantidade.getText().toString().equals("")){
            alerta("Preencha o campo Quantidade");
            edtQuantidade.requestFocus();
        }else {

            produto = edtProduto.getText().toString();
            quantidade = Double.parseDouble(edtQuantidade.getText().toString());

            comprar.add(edtProduto.getText().toString()+"-"+edtQuantidade.getText().toString());
            edtProduto.setText("");
            edtQuantidade.setText("");
            edtProduto.requestFocus();
            alerta("Adicionado com sucesso!");

        }
    }

    public void alerta(String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(Compras.this);
        alert.setMessage(msg);
        alert.setTitle("Alerta");
        alert.setNeutralButton("OK",null);
        alert.show();
    }
    public void listar(View v){

        Intent i = new Intent(Compras.this,Lista.class);
        i.putExtra("comprar",comprar);
        startActivity(i);

    }
}