package com.example.fahid.demospinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spin;
    private String myspin;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin= (Spinner) findViewById(R.id.spinner);
        textView=(TextView)findViewById(R.id.text1);
        button=(Button)findViewById(R.id.Btn1);


        ArrayAdapter<CharSequence>myadapter=
                ArrayAdapter.createFromResource(this,R.array.Division,R.layout.support_simple_spinner_dropdown_item);
        myadapter.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);
        spin.setAdapter(myadapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                myspin=spin.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("spin",myspin);
                startActivity(intent);
            }
        });




    }

}
