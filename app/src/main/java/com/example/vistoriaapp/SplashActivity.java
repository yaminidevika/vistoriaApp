package com.example.vistoriaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    public void openNextScreen(View view) {
        Intent intent=new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
