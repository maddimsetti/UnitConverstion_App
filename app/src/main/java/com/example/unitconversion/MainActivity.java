package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT = 3000;
    //After Completion of 3000ms, the next Activity will get Started.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setWindowFlags();
        setContentView(R.layout.activity_main); //this will bind your MainActivity.class file with Activity_main.
        navigateToHomeScreenDelayed();
    }

    private void setWindowFlags() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //This method is used so that your splash activity can cover the entire Screen
    }

    public void navigateToHomeScreenDelayed() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent navigateToHomeActivity = new Intent(MainActivity.this, HomeActivity.class); //Intent is Used to switch from one activity to another activity.

                startActivity(navigateToHomeActivity); //invoke the HomeActivity.

                finish(); //the Current Activity will get Finished.
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}