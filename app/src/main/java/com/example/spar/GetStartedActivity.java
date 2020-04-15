package com.example.spar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class GetStartedActivity extends AppCompatActivity
{
    private Button btngetstarted;
    private FrameLayout content_frame;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_get_started);
        btngetstarted=findViewById(R.id.btngetstarted);

        btngetstarted.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(GetStartedActivity.this,LoginDetailActivity.class);

                startActivity(intent);

            }
        });
    }
}
