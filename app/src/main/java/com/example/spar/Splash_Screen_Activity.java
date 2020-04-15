package com.example.spar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash_Screen_Activity extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Splash screen timer
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable()
        {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over Start your app main activity

                Intent i = new Intent(Splash_Screen_Activity.this, DashBoardActivity.class);

                startActivity(i);


                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
