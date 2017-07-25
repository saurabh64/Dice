package com.example.saurabh.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=(Button) findViewById(R.id.btnRoll);

        final ImageView leftDice=(ImageView) findViewById(R.id.imgLeftDice);
        final ImageView rightDice=(ImageView)findViewById(R.id.imgRightDice);

        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6


        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(),"Roll button clicked",Toast.LENGTH_LONG).show();

                Random randomNumberGenerator = new Random();
                int number =randomNumberGenerator.nextInt(6);
                //Toast.makeText(view.getContext(),"Roll button clicked"+number,Toast.LENGTH_SHORT).show();

                leftDice.setImageResource(diceArray[number]);
                number =randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });



    }
}
