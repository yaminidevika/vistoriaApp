package com.example.vistoriaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Successful extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful);
        ImageView gifView=findViewById(R.id.successGif);
        Glide.with(this)
                .asGif()
                .load(R.raw.success_tick)
                .into(gifView);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent=new Intent(Successful.this, DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
