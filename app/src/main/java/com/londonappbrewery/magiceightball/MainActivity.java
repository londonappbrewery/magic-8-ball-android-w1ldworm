package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askBtn = (Button) findViewById(R.id.askButton);
        final ImageView ball = (ImageView) findViewById(R.id.image_eightBall);

        final int[] answers = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndGenerator = new Random();

                int ans = rndGenerator.nextInt(4);

                ball.setImageResource(answers[ans]);
            }
        });
    }
}
