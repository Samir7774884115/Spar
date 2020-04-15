package com.example.spar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryModeActivity extends AppCompatActivity
{
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_mode);
        btn1=findViewById(R.id.btncnc);
        btn2=findViewById(R.id.btndelivery);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                btn1.setBackgroundColor(getResources().getColor(R.color.colorselectmode));
                btn1.setTextColor(getResources().getColor(R.color.colorwhite));
                btn2.setBackgroundColor(getResources().getColor(R.color.colorwhite));
                btn2.setTextColor(getResources().getColor(R.color.colorblack));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                btn2.setBackgroundColor(getResources().getColor(R.color.colorselectmode));
                btn2.setTextColor(getResources().getColor(R.color.colorwhite));
                btn1.setBackgroundColor(getResources().getColor(R.color.colorwhite));
                btn1.setTextColor(getResources().getColor(R.color.colorblack));

            }
        });


    }
}
