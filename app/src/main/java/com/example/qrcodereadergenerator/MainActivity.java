package com.example.qrcodereadergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void readQr(View view){
        Intent intent=new Intent(MainActivity.this,QrReader.class);
        startActivity(intent);
    }
    public void generateQr(View view){
        Intent intent=new Intent(MainActivity.this,QrGenerate.class);
        startActivity(intent);
    }
}
