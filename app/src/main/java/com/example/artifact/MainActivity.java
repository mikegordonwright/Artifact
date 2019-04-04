package com.example.artifact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1.findViewById(R.id.button1);
        button2.findViewById(R.id.button2);
        button3.findViewById(R.id.button3);
        button4.findViewById(R.id.button4);
        button5.findViewById(R.id.button5);
        button6.findViewById(R.id.button6);

    }
}
