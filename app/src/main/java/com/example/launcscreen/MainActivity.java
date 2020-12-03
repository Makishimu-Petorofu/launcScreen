package com.example.launcscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        username = findViewById(R.id.edUsername);
        password = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }
}