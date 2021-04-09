package com.mobi.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        /*
        * Pega a Intent que foi inciou esta activity e extrai a string
        * */
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        /*
        * Capturar o componente textView e repassar a mensagem enviada da tela anterior.
        * */
        TextView textview = (TextView) findViewById(R.id.domPedroI);
        textview.setText(message);
    }
}