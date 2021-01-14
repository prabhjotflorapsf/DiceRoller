package com.example.adity.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imgView01;
    private Button rollButton;
    private Random randomDiceGenrater = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView01 = findViewById(R.id.imageView01);


        rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceRoller(imgView01);

            }
        });
    }

    private void diceRoller(ImageView imgView)
    {
        int rdg = randomDiceGenrater.nextInt(6) + 1;

        Log.d("Checking", "" + rdg);
        switch (rdg)
        {
            case 1:
                imgView.setImageResource(R.drawable.dice01);
                break;
            case 2:
                imgView.setImageResource(R.drawable.dice02);
                break;
            case 3:
                imgView.setImageResource(R.drawable.dice03);
                break;
            case 4:
                imgView.setImageResource(R.drawable.dice04);
                break;
            case 5:
                imgView.setImageResource(R.drawable.dice05);
                break;
            case 6:
                imgView.setImageResource(R.drawable.dice06);
                break;

        }
    }
}
