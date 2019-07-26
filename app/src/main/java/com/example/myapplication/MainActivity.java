package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt1, bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.BT1);
        bt2=(Button)findViewById(R.id.BT2);

    }
    public void  reg(View view){
        Intent siguiente =new Intent(this, MainActivity.class);
        startActivityForResult(siguiente, 0);
    }
    public void  ingresa(View view){
        Intent siguiente =new Intent(this, Main2Activity.class);
        startActivityForResult(siguiente, 0);
        Toast.makeText(this, "ingresa usuario y contraseña", Toast.LENGTH_LONG).show();
    }

}
