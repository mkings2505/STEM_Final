package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameQTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_qtwo);


        Button toQThreeYes = (Button) findViewById(R.id.btnQTwoYes);
        toQThreeYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQTwo.this, GameQThree.class);
                startActivity(intent);
                GameStart.day += 2;
            }

        });

        Button toQThreeNo = (Button) findViewById(R.id.btnQTwoNo);
        toQThreeNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQTwo.this, GameQThree.class);
                startActivity(intent);
            }

        });

    }
}
