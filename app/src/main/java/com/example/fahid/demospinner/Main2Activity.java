package com.example.fahid.demospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // textView= (TextView) findViewById(R.id.textsw);
        String s=getIntent().getStringExtra("spin");
       // textView.setText(s);
    }
}
