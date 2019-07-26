package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private Button bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bt6=(Button)findViewById(R.id.BT6);
    }
    public void  cargar(View view){
        Intent siguiente =new Intent(this, Main5Activity.class);
        startActivityForResult(siguiente, 0);
        Toast.makeText(this, "informacion", Toast.LENGTH_LONG).show();
    }
}
