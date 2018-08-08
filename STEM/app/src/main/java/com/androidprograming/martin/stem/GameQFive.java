package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameQFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_qfive);


        Button toRevealDay = (Button) findViewById(R.id.btnQFiveYes);
        toRevealDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQFive.this, RevealDay.class);
                startActivity(intent);
                GameStart.day += 16;
            }

        });

        Button toQFiveNo = (Button) findViewById(R.id.btnQFiveNo);
        toQFiveNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQFive.this, RevealDay.class);
                startActivity(intent);
            }

        });

    }
}
