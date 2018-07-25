package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class PlayHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.play_home);

        Button toHome = (Button) findViewById(R.id.btnHomePlay);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayHome.this, Home.class);
                startActivity(intent);
            }

        });

        Button toStudyHome = (Button) findViewById(R.id.btnStudyPlay);
        toStudyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayHome.this, StudyHome.class);
                startActivity(intent);
            }

        });
    }
}
