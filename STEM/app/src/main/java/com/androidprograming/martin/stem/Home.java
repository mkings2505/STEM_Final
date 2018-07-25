package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home);

        Button toPlayHome = (Button) findViewById(R.id.btnPlayHome);
            toPlayHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Home.this, PlayHome.class);
                    startActivity(intent);
                }
            });
        Button toStudyHome = (Button) findViewById(R.id.btnStudyHome);
            toStudyHome.setOnClickListener(new View.OnClickListener() {
               @Override
                public void onClick(View view) {
                   Intent intent = new Intent(Home.this, StudyHome.class);
                   startActivity(intent);
               }
            });
    }
}
