package com.example.a01_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView name = findViewById(R.id.name_second);
        TextView email = findViewById(R.id.email_second);

        String email2 = getIntent().getStringExtra("email");
        String name2 = getIntent().getStringExtra("name");

        name.setText(name2);
        email.setText(email2);

        Button button_back = findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
