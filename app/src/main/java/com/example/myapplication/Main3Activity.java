package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private Button bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bt6=(Button)findViewById(R.id.BT6);
    }
    public void  cargar(View view){
        Intent siguiente =new Intent(this, Main4Activity.class);
        startActivityForResult(siguiente, 0);
        Toast.makeText(this, "ingresa profesores", Toast.LENGTH_LONG).show();
    }

    public void salir(View view){
        System.exit(0);

}
    }

