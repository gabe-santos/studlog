package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Gpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpa);


        Button btn = (Button)findViewById(R.id.buttonSub);
        Button btn2 = (Button)findViewById(R.id.buttonBac);

        EditText class1 = (EditText) findViewById(R.id.credit);
        EditText class2 = (EditText) findViewById(R.id.credit1);
        EditText class3 = (EditText) findViewById(R.id.credit2);
        EditText class4 = (EditText) findViewById(R.id.credit3);

        EditText gpa1 = (EditText) findViewById(R.id.dif);
        EditText gpa2 = (EditText) findViewById(R.id.dif1);
        EditText gpa3 = (EditText) findViewById(R.id.dif2);
        EditText gpa4 = (EditText) findViewById(R.id.dif3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = class1.getText().toString();
                double cla1 = Double.parseDouble(input);

                String input2 = class2.getText().toString();
                double cla2 = Double.parseDouble(input2);

                String input3 = class3.getText().toString();
                double cla3 = Double.parseDouble(input3);

                String input4 = class4.getText().toString();
                double cla4 = Double.parseDouble(input4);

                String input5 = gpa1.getText().toString();


                String input6 = gpa2.getText().toString();


                String input7 = gpa3.getText().toString();


                String input8 = gpa4.getText().toString();


                double vClas1 = studyTime(input5, cla1);
                double vClas2 = studyTime(input6, cla2);
                double vClas3 = studyTime(input7, cla3);
                double vClas4 = studyTime(input8, cla4);

                double total = (vClas1 + vClas2 + vClas3 + vClas4)/(cla1+cla2+cla3+cla4);

                String newVal = Double.toString(total);

                Intent send = new Intent(Gpa.this, DisplayGPA.class);
                Bundle put = new Bundle();
                put.putString("GPA", newVal);
                send.putExtras(put);
                startActivity(send);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Gpa.this, MainActivity.class));
            }
        });
    }
    double studyTime (String gpa, double cred){
        double time = 0;

        if(gpa.charAt(0) == 'A'){

            if(gpa.length()==2){
                if(gpa.charAt(1) == '-'){
                    time = cred*3.7;
                }
                else if (gpa.charAt(1) == '+')
                    time = cred*4.0;
            }
            else
            time = cred*4.0;
        }
        else if(gpa.charAt(0) == 'B'){

            if(gpa.length()==2){
                if(gpa.charAt(1) == '-'){
                    time = cred*2.7;
                }
                else if (gpa.charAt(1) == '+')
                    time = cred*3.3;
            }
            else
                time = cred*3.0;
        }
        else if(gpa.charAt(0) == 'C'){

            if(gpa.length()==2){
                if(gpa.charAt(1) == '-'){
                    time = cred*1.7;
                }
                else if (gpa.charAt(1) == '+')
                    time = cred*2.3;
            }
            else
                time = cred*2.0;
        }
        else if(gpa.charAt(0) == 'D'){

            if(gpa.length()==2){
                if(gpa.charAt(1) == '+'){
                    time = cred*1.3;
                }
            }
            else
                time = cred*1.0;
        }
        else
            time = cred*0;

        return time;
    }
}
