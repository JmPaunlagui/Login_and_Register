package com.jomo.myapplicationloginandregister;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.textclassifier.TextClassifierEvent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.signupScreen).setOnClickListener(null);

    }

    @Override
    public void onClick(View v) {
        //iTouch da screen

    }

}
