package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class work_experience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_experience);

        Button next5 = findViewById(R.id.bt5);
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });
    }

    private void moveNext() {
        Intent intent = new Intent(work_experience.this,academic_achievements.class);
        startActivity(intent);
    }

}