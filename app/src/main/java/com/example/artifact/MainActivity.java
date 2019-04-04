package com.example.artifact;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Button button6;
    protected MediaPlayer mp1;
    protected MediaPlayer mp2;
    protected MediaPlayer mp3;
    protected MediaPlayer mp4;
    protected MediaPlayer mp5;
    protected MediaPlayer mp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);


        mp1 = MediaPlayer.create(this, R.raw.song);
        mp2 = MediaPlayer.create(this, R.raw.song);
        mp3 = MediaPlayer.create(this, R.raw.song);
        mp4 = MediaPlayer.create(this, R.raw.song);
        mp5 = MediaPlayer.create(this, R.raw.song);
        mp6 = MediaPlayer.create(this, R.raw.song);

        setupListeners();
        setupCompletionListeners();

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
                mp3.start();
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

        button6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });

    }


    void setupCompletionListeners() {

        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });

        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });

        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });

        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });

        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });

        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp1.release();
            }
        });
    }

}
