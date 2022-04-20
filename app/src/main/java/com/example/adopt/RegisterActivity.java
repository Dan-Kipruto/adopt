package com.example.adopt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    private TextView textView;
    private Button signUpBtn;
    private EditText mEmail, mUserName, mPhone, mPass;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //get the ids

        mEmail = findViewById(R.id.regEmail);
        mUserName = findViewById(R.id.regUsername);
        signUpBtn = findViewById(R.id.regButton);
        mPhone = findViewById(R.id.regPhone);
        mPass = findViewById(R.id.regPassword);
        textView = findViewById(R.id.textView10);

        //initialize firebase Auth

        mAuth = FirebaseAuth.getInstance();

        //move to login activity
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //create user with  firebase
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });

    }

    private void createUser() {
        String email = mEmail.getText().toString();
        String pass = mPass.getText().toString();
        String username = mUserName.getText().toString();
        String phone = mPhone.getText().toString();

        //Register user with email and password

        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            if (!pass.isEmpty()) {
                mAuth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                finish();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(RegisterActivity.this, "Registration Error", Toast.LENGTH_SHORT).show();

                    }
                });
            } else {
                mPass.setError("Empty Fields Are no Allowed");
            }
        } else if (email.isEmpty()) {
            mEmail.setError("Empty Fields Are no Allowed");
        } else {
            mEmail.setError("PLease Enter the correct email");
        }
    }
}