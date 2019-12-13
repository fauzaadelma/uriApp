package com.example.uriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JsonActivity extends AppCompatActivity {
    Button click;
    public static TextView data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        click = (Button) findViewById(R.id.button);
        data = (TextView) findViewById(R.id.fetched_data);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData process = new fetchData();
                process.execute();
            }
        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
