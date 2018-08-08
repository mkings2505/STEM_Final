package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalcLessonOneWrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_lesson_one_wrong);


        Button toStudyHome = (Button) findViewById(R.id.btnWrongStudyHome);
        toStudyHome.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(CalcLessonOneWrong.this, StudyHome.class);
               startActivity(intent);
           }
        });

    }
}
