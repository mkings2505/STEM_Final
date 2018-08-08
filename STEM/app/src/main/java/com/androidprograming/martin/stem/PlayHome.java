package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class PlayHome extends AppCompatActivity {

    static int points = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.play_home);

        final TextView textViewPoints = (TextView) this.findViewById(R.id.txtViewPoint);
        textViewPoints.setText(String.valueOf(points));

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

        if (points >= 20) {

            Button toGameStart = (Button) findViewById(R.id.btnStartGame);
            toGameStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PlayHome.this, GameStart.class);
                    startActivity(intent);
                    points -= 20;
                }

            });
        }
        else if (points < 20) {
            Button toCantGame = (Button) findViewById(R.id.btnStartGame);
            toCantGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PlayHome.this, CantGame.class);
                    startActivity(intent);

                }

            });
        }
    }
}
