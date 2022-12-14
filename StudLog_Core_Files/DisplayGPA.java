package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayGPA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaygpa);

        Button btn = (Button)findViewById(R.id.buttonHom);

        Bundle get = getIntent().getExtras();
        String value = get.getString("GPA");
        TextView text = findViewById(R.id.credits);
        text.setText(value);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayGPA.this, MainActivity.class));
            }
        });

    }
}
