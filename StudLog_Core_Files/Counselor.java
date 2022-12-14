package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Counselor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.councler);

        EditText in = (EditText) findViewById(R.id.credit);
        Button btn = (Button)findViewById(R.id.buttonS);
        Button btn2 = (Button)findViewById(R.id.buttonB);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = in.getText().toString();
                int value = Integer.parseInt(input);
                value = value*3;
                String newVal = Integer.toString(value);
                Intent send = new Intent(Counselor.this, DisplayC.class);
                Bundle put = new Bundle();
                put.putString("credits", newVal);
                send.putExtras(put);
                startActivity(send);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Counselor.this, MainActivity.class));
            }
        });
    }
}
