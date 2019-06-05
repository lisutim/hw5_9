package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import java.util.Random;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView txrR, txrG, txrB, txr;
    String text = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txrR = findViewById(R.id.textView3);
        txrG = findViewById(R.id.textView4);
        txrB = findViewById(R.id.textView5);
        txr = findViewById(R.id.textView6);
    }

    public void changecolor (View v){
        Random x = new Random();

        int red = x.nextInt(256);
        txrR.setText("RED : "+red);
        txrR.setTextColor(Color.rgb(red, 0, 0));

        int green = x.nextInt(256);
        txrG.setText("GREEN : "+green);
        txrG.setTextColor(Color.rgb(0, green, 0));

        int blue = x.nextInt(256);
        txrB.setText("BLUE : "+blue);
        txrB.setTextColor(Color.rgb(0, 0, blue));

        text += red +", "+green+","+blue+"\n";
        txr.setTextSize(16);
        txr.setText(text);
        txr.setMovementMethod(new ScrollingMovementMethod());
        txr.setBackgroundColor(Color.rgb(red,green,blue));



    }
}
