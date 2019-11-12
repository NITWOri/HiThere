package com.example.student1.firstprobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = findViewByld(R.id.label);
        Button b = findViewById(R.id.button);
        MyOnSmthListner listner = new MyOnSmthListner(tw);
    }

    @Override
    protected void onRestart(){

        super.onRestart();
    }
}
