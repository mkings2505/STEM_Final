package com.androidprograming.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RevealDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reveal_day);

        final TextView textViewDay = (TextView) this.findViewById(R.id.textViewDay);

        Button reveal = (Button) findViewById(R.id.btnReveal);
        reveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(RevealDay.this, RevealDay.class);
               startActivity(intent);
                textViewDay.setText(String.valueOf(GameStart.day));
            }

        });

        Button toHome = (Button) findViewById(R.id.btnRevealHome);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RevealDay.this, Home.class);
                startActivity(intent);
            }

        });

    }
}
