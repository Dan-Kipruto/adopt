package com.example.adopt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgotpassword extends AppCompatActivity {
    private EditText mEmail ;
    private Button mSubmit ;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        //get the ids

        mEmail = findViewById(R.id.forgotEmail);
        mSubmit = findViewById(R.id.forgotSubmit);

        //firebase instance

        mAuth = FirebaseAuth.getInstance();

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText().toString().trim();
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(getApplication(),"Enter your registered Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Forgotpassword.this,"Check your Email for the reset link",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Forgotpassword.this, LoginActivity.class));
                            finish();
                        }else{
                            Toast.makeText(Forgotpassword.this,"A account with that email is not found",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Forgotpassword.this, RegisterActivity.class));
                            finish();
                        }

                    }
                });

            }
        });

    }
}