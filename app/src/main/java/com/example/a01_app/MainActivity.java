package com.example.a01_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNombre = findViewById(R.id.name_second);
        EditText editEmail = findViewById(R.id.email_second);
        Button enterButton = findViewById(R.id.button_enter);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editNombre.getText().toString();
                String email = editEmail.getText().toString();

                if (name.isEmpty()) {
                    editNombre.setError("Ingrese su nombre");
                    return;
                }

                if (email.isEmpty()) {
                    editEmail.setError("Ingrese su email");
                    return;
                }

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });


    }


}