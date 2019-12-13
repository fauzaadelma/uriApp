package com.example.uriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
