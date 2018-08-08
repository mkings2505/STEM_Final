package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcLessonOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_lesson_one);

        EditText calcQOneAns = (EditText) findViewById(R.id.txtCalcQOneAns);
        String answer = calcQOneAns.getText().toString();
        if (answer.toString() == "6x") {
            Button toCorrect = (Button) findViewById(R.id.btnSubmitCalcOne);
            toCorrect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CalcLessonOne.this, CalcLessonOneCorrect.class);
                    startActivity(intent);
                    PlayHome.points += 10;
                }

            });
        }
        if (answer.toString() != "6x") {
            Button toWrong = (Button) findViewById(R.id.btnSubmitCalcOne);
            toWrong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CalcLessonOne.this, CalcLessonOneWrong.class);
                    startActivity(intent);
                    PlayHome.points += 10;
                }
            });
            }
        }
    }
