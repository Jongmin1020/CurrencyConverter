package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview2 = (TextView) findViewById(R.id.textview2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textview2.setText(" " + str);
    }
}
