package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
private Button bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        bt7=(Button)findViewById(R.id.BT7);
    }
    public void  corregir(View view){
        Intent siguiente =new Intent(this, Main3Activity.class);
        startActivityForResult(siguiente, 0);
    }
}
