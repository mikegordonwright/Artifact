package com.example.artifact;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected MediaPlayer mp1;
    protected MediaPlayer mp2;
    protected MediaPlayer mp3;
    protected MediaPlayer mp4;
    protected MediaPlayer mp5;
    protected ConstraintLayout conLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //fit steering wheel background to screen size
        conLayout = findViewById(R.id.conLayout);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;

        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, width);
        conLayout.setLayoutParams(lp);
        lp.addRule(RelativeLayout.CENTER_IN_PARENT);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);


        mp1 = MediaPlayer.create(this, R.raw.horn);
        mp2 = MediaPlayer.create(this, R.raw.chime);
        mp3 = MediaPlayer.create(this, R.raw.bell);
        mp4 = MediaPlayer.create(this, R.raw.ping);
        mp5 = MediaPlayer.create(this, R.raw.longbeep);

        setupListeners();

    }



    void setupListeners() {
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });

        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });

        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!mp1.isPlaying()) mp3.start();
            }
        });

        button4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });

        button5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });

    }


}
