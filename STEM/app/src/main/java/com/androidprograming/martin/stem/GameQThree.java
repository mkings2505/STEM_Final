package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameQThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_qthree);


        Button toQFourYes = (Button) findViewById(R.id.btnQThreeYes);
        toQFourYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQThree.this, GameQFour.class);
                startActivity(intent);
                GameStart.day += 4;
            }

        });

        Button toQFourNo = (Button) findViewById(R.id.btnQThreeNo);
        toQFourNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameQThree.this, GameQFour.class);
                startActivity(intent);
            }

        });

    }
}
