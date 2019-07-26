package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button bt2;
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt2=(Button)findViewById(R.id.BT2);
        bt1=(Button)findViewById(R.id.BT1);
    }
    public void  reg(View view){
        Intent siguiente =new Intent(this, MainActivity.class);
        startActivityForResult(siguiente, 0);
    }
    public void  ingresa(View view){
        Intent siguiente =new Intent(this, Main3Activity.class);
        startActivityForResult(siguiente, 0);
    }
}
