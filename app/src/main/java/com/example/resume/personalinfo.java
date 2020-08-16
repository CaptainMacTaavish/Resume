package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personalinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinfo);

        Button next2 = findViewById(R.id.bt2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });
    }
    private void moveNext(){
        Intent intent = new Intent(personalinfo.this, education.class);
        startActivity(intent);
    }
}