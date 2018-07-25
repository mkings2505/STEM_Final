package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class StudyHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.study_home);

        Button toPlayHome = (Button) findViewById(R.id.btnPlayStudy);
        toPlayHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyHome.this, PlayHome.class);
                startActivity(intent);
            }

        });

        Button toHome = (Button) findViewById(R.id.btnHomeStudy);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyHome.this, Home.class);
                startActivity(intent);
            }

        });
    }
}
