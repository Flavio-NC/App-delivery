package com.example.foodin.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.foodin.R;

public class MainActivity extends AppCompatActivity {

    private TextView textlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                abrirAutentificacao();
            }
        }, 3000);
    }
    private void abrirAutentificacao(){
        Intent i = new Intent(MainActivity.this, AutentificacaoaActivity.class);
        startActivity(i);
        finish();
    }
}