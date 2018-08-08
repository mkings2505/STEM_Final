package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameQOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_qone);


        Button toQTwoYes = (Button) findViewById(R.id.btnQOneYes);
        toQTwoYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQOne.this, GameQTwo.class);
                startActivity(intent);
                GameStart.day += 1;
            }

        });

        Button toQTwoNo = (Button) findViewById(R.id.btnQOneNo);
        toQTwoNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQOne.this, GameQTwo.class);
                startActivity(intent);
            }

        });

    }
}
