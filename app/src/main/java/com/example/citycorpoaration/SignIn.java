package com.example.citycorpoaration;;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public class SignIn extends AppCompatActivity {
    TextView login;
    Button submit;
    TextInputEditText email, password,forgotpassword,signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        submit = findViewById(R.id.submit_btn);
        signup = findViewById(R.id.signup_btn);
        email = findViewById(R.id.email1);
        password = findViewById(R.id.pwd1);
        forgotpassword = findViewById(R.id.forgot_password1_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, MainActivity.class));
            }

        });
       
    }
}