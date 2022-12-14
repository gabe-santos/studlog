package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayS  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displays);

        Button btn = (Button)findViewById(R.id.buttonHom);

        Bundle get = getIntent().getExtras();
        String value = get.getString("credits");

        String class1 = get.getString("class1");
        String class2 = get.getString("class2");
        String class3 = get.getString("class3");
        String class4 = get.getString("class4");

        String credit1 = get.getString("credits1");
        String credit2 = get.getString("credits2");
        String credit3 = get.getString("credits3");
        String credit4 = get.getString("credits4");

        TextView text = findViewById(R.id.credits);

        TextView vClass1 = findViewById(R.id.class1);
        TextView vClass2 = findViewById(R.id.class2);
        TextView vClass3 = findViewById(R.id.class3);
        TextView vClass4 = findViewById(R.id.class4);

        TextView vCredits1 = findViewById(R.id.credits1);
        TextView vCredits2 = findViewById(R.id.credits2);
        TextView vCredits3 = findViewById(R.id.credits3);
        TextView vCredits4 = findViewById(R.id.credits4);

        text.setText(value);

        vClass1.setText(class1);
        vClass2.setText(class2);
        vClass3.setText(class3);
        vClass4.setText(class4);

        vCredits1.setText(credit1);
        vCredits2.setText(credit2);
        vCredits3.setText(credit3);
        vCredits4.setText(credit4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayS.this, MainActivity.class));
            }
        });

    }
}
