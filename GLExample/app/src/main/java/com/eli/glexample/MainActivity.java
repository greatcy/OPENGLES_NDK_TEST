package com.eli.glexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MySurfaceView surfaceView = new MySurfaceView(this);
        setContentView(surfaceView);

//        setContentView(R.layout.activity_main);
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(MyJNILib.testGetString());
    }
}
