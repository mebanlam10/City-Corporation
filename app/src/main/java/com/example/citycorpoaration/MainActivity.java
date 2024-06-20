package com.example.citycorpoaration;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button submitbutton;
    TextInputEditText idemailtextfield, idpasswordtextfield;
    TextView signup, forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitbutton = findViewById(R.id.submitButton);
        idemailtextfield = findViewById(R.id.idemailtextfield);
        idpasswordtextfield = findViewById(R.id.idpasswordtextfield);
        signup = findViewById(R.id.idSignup);
        forgotpassword = findViewById(R.id.resetButton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_str = idemailtextfield.getText().toString().trim();
                String password_str = idpasswordtextfield.getText().toString().trim();

                if (email_str.isEmpty()) {
                    idemailtextfield.setError("Email is required");
                    idemailtextfield.requestFocus();
                }
                else if (password_str.isEmpty()) {
                    idpasswordtextfield.setError("Password is required");
                    idpasswordtextfield.requestFocus();
                }
                else if (password_str.length()<6) {
                    idpasswordtextfield.setError("Password must contain at least 6 characters");
                    idpasswordtextfield.requestFocus();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}