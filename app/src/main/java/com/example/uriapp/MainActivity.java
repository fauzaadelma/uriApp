package com.example.uriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btn_1);
        btnOne.setOnClickListener(this);
        btnTwo = findViewById(R.id.btn_2);
        btnTwo.setOnClickListener(this);
        btnThree = findViewById(R.id.btn_3);
        btnThree.setOnClickListener(this);
        btnFour = findViewById(R.id.btn_4);
        btnFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(this,
                        GreetingActivity.class));
                break;
        }

        switch (view.getId()) {
            case R.id.btn_2:
                startActivity(new Intent(this,
                        ReportActivity.class));
                break;
        }

        switch (view.getId()) {
            case R.id.btn_3:
                startActivity(new Intent(this,
                        ListActivity.class));
                 break;
        }

        switch (view.getId()) {
            case R.id.btn_4:
                startActivity(new Intent(this,
                        JsonActivity.class));
                break;
        }
    }
}
