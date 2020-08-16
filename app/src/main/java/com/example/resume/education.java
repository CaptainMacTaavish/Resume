package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        Button next3 = findViewById(R.id.bt3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });
    }
    private void moveNext(){
        Intent intent = new Intent(education.this, technical_strengths.class);
        startActivity(intent);
    }
}