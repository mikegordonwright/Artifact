package com.example.artifact;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
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
    protected Switch switch1;
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

        //setup layout elements
        switch1 = findViewById(R.id.switch1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button1.setText("Horn");
        button2.setText("Excuse me");
        button3.setText("lane change");
        button4.setText("Hello");
        button5.setText("move!");

        //setup sounds
        mp1 = MediaPlayer.create(this, R.raw.horn);
        mp2 = MediaPlayer.create(this, R.raw.excuseme);
        mp3 = MediaPlayer.create(this, R.raw.bell);
        mp4 = MediaPlayer.create(this, R.raw.hello);
        mp5 = MediaPlayer.create(this, R.raw.chime);

        //all the onclicks
        setupListeners();
    }



    void setupListeners() {

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if (switch1.isChecked()) {
                    button1.setText("klaxon");
                    button2.setText("excusez-moi");
                    button3.setText("changer de voie");
                    button4.setText("allo");
                    button5.setText("bougez!");
                }else
                {
                    button1.setText("Horn");
                    button2.setText("Excuse me");
                    button3.setText("lane change");
                    button4.setText("Hello");
                    button5.setText("move!");
                }
            }
        });


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
