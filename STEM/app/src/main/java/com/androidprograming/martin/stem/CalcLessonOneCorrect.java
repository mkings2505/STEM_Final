package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalcLessonOneCorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_lesson_one_correct);


        Button toStudyHome = (Button) findViewById(R.id.btnCorrectStudyHome);
        toStudyHome.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(CalcLessonOneCorrect.this, StudyHome.class);
               startActivity(intent);
           }
        });

    }
}
