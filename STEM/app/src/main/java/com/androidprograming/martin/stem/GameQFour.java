package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameQFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_qfour);


        Button toQFiveYes = (Button) findViewById(R.id.btnQFourYes);
        toQFiveYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQFour.this, GameQFive.class);
                startActivity(intent);
                GameStart.day += 8;
            }

        });

        Button toQFiveNo = (Button) findViewById(R.id.btnQFourNo);
        toQFiveNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQFour.this, GameQFive.class);
                startActivity(intent);
            }

        });


    }
}
