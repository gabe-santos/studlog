package com.home.studlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayc);

        Button btn = (Button)findViewById(R.id.buttonHom);

        Bundle get = getIntent().getExtras();
        String value = get.getString("credits");
        TextView text = findViewById(R.id.credits);
        text.setText(value);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayC.this, MainActivity.class));
            }
        });
    }
}