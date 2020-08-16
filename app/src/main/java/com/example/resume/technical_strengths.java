package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class technical_strengths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_strengths);

        Button next4 = findViewById(R.id.bt4);
                next4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        moveNext();
                    }
                });
    }
    private void moveNext(){
        Intent intent = new Intent(technical_strengths.this, work_experience.class );
        startActivity(intent);
    }
}