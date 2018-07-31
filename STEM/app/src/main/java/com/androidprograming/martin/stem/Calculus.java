package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculus_home);

        Button toCalcLessonOne = (Button) findViewById(R.id.btnCalcOne);
        toCalcLessonOne.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(Calculus.this, CalcLessonOne.class);
               startActivity(intent);
           }
        });
    }
}
