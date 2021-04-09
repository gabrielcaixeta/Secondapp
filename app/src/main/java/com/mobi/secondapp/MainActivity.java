package com.mobi.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.mobi.secondapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        //Intent

        //Criamos a intenção da ir para uma outra tela.
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Pegamos o Elemento de input
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);
        //recuperamos a mensagem do elemento.
        String message = editText.getText().toString();
        // enviamos a informação para a outra tela, usando uma coleção de (chave, valor)
        intent.putExtra(EXTRA_MESSAGE, message);
        //iniciamos a outra tela.
        startActivity(intent);
    }
}