package com.example.vistoriaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextName,editTextEmail,editTextPassword,editTextConfirmPasssword;
    Button buttonRegister;
    CheckBox termsCheckbox;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextName=findViewById(R.id.full_name);
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);
        editTextConfirmPasssword=findViewById(R.id.confirm_password);
        buttonRegister=findViewById(R.id.register_btn);
        termsCheckbox=findViewById(R.id.terms_checkbox);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString();
                String confirmPassword = editTextConfirmPasssword.getText().toString();
                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(RegisterActivity.this, "Enter valid email", Toast.LENGTH_SHORT).show();
                } else if (password.length() < 6) {
                    Toast.makeText(RegisterActivity.this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(RegisterActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }  else if (!termsCheckbox.isChecked()) {
                    Toast.makeText(RegisterActivity.this, "Please agree to the Terms and Conditions", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(RegisterActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, Successful.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


            }



    public void gotosignin(View view) {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    public void terms(View view) {
        Intent intent=new Intent(this,Terms.class);
        startActivity(intent);
    }

}

