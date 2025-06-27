package com.example.vistoriaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void gotosignup(View view) {
        Intent intent=new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void gotoForgot(View view) {
        Intent intent=new Intent(this, ForgetPassword.class);
        startActivity(intent);
    }

    public void loginUser(View view) {
        Intent intent=new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
}
