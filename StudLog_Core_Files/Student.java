package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);


        Button btn = (Button)findViewById(R.id.buttonSub);
        Button btn2 = (Button)findViewById(R.id.buttonBac);
        Button btn3 = (Button)findViewById(R.id.buttonGPA);

        EditText class1 = (EditText) findViewById(R.id.credit);
        EditText class2 = (EditText) findViewById(R.id.credit1);
        EditText class3 = (EditText) findViewById(R.id.credit2);
        EditText class4 = (EditText) findViewById(R.id.credit3);

        EditText dif1 = (EditText) findViewById(R.id.dif);
        EditText dif2 = (EditText) findViewById(R.id.dif1);
        EditText dif3 = (EditText) findViewById(R.id.dif2);
        EditText dif4 = (EditText) findViewById(R.id.dif3);

        EditText c1 = (EditText) findViewById(R.id.textView);
        EditText c2 = (EditText) findViewById(R.id.textView2);
        EditText c3 = (EditText) findViewById(R.id.textView3);
        EditText c4 = (EditText) findViewById(R.id.textView4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cl1 = c1.getText().toString();
                String cl2 = c2.getText().toString();
                String cl3 = c3.getText().toString();
                String cl4 = c4.getText().toString();

                String input = class1.getText().toString();
                int cla1 = Integer.parseInt(input);

                String input2 = class2.getText().toString();
                int cla2 = Integer.parseInt(input2);

                String input3 = class3.getText().toString();
                int cla3 = Integer.parseInt(input3);

                String input4 = class4.getText().toString();
                int cla4 = Integer.parseInt(input4);

                String input5 = dif1.getText().toString();
                int diff1 = Integer.parseInt(input5);

                String input6 = dif2.getText().toString();
                int diff2 = Integer.parseInt(input6);

                String input7 = dif3.getText().toString();
                int diff3 = Integer.parseInt(input7);

                String input8 = dif4.getText().toString();
                int diff4 = Integer.parseInt(input8);

                int vClas1 = studyTime(diff1, cla1);
                int vClas2 = studyTime(diff2, cla2);
                int vClas3 = studyTime(diff3, cla3);
                int vClas4 = studyTime(diff4, cla4);

                int total = vClas1 + vClas2 + vClas3 + vClas4;

                String newVal = Integer.toString(total);

                Intent send = new Intent(Student.this, DisplayS.class);
                Bundle put = new Bundle();
                put.putString("credits", newVal);
                put.putString("credits1", String.valueOf(vClas1));
                put.putString("credits2", String.valueOf(vClas2));
                put.putString("credits3", String.valueOf(vClas3));
                put.putString("credits4", String.valueOf(vClas4));
                put.putString("class1", cl1);
                put.putString("class2", cl2);
                put.putString("class3", cl3);
                put.putString("class4", cl4);
                send.putExtras(put);
                startActivity(send);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student.this, MainActivity.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student.this, Gpa.class));
            }
        });
    }
    public int studyTime (int diff, int cred){
        int time = 0;

        if (diff < 2){
            time = cred * 2;
        }
        else if (diff == 2){
            time = cred * 3;
        }
        else if (diff == 3){
            time = cred * 4;
        }

        return time;
    }
}