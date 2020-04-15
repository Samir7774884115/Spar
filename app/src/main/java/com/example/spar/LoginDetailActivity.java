package com.example.spar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginDetailActivity extends AppCompatActivity
{
    private Button btn1,btn2;
    private int buttonState = 1;
    private TextView forgotpass;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_detail);
         forgotpass=findViewById(R.id.txtforgot);

        btn1=findViewById(R.id.btnsignin);

        btn2=findViewById(R.id.btnsignup);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                btn2.setBackgroundColor(getResources().getColor(R.color.colorlinback));
                btn2.setTextColor(getResources().getColor(R.color.colorblack));
                btn1.setBackgroundColor(getResources().getColor(R.color.colorback));
                btn1.setTextColor(getResources().getColor(R.color.colorwhite));
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final AlertDialog.Builder builder = new AlertDialog.Builder(LoginDetailActivity.this);

                final View viewInflated = LayoutInflater.from(LoginDetailActivity.this).inflate(R.layout.forgotpassword_dialog, null);

                final EditText emailedt = (EditText) viewInflated.findViewById(R.id.emailedtText);

                final Button Submitemail = (Button) viewInflated.findViewById(R.id.btnsubmit);

                builder.setCancelable(true);

                builder.setView(viewInflated);

                builder.show();
                Submitemail.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                       // builder.dismiss();

                    }
                });

            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(LoginDetailActivity.this,SignUpActivity.class);

                startActivity(intent);
                btn2.setBackgroundColor(getResources().getColor(R.color.colorback));
                btn2.setTextColor(getResources().getColor(R.color.colorwhite));
                btn1.setBackgroundColor(getResources().getColor(R.color.colorlinback));
                btn1.setTextColor(getResources().getColor(R.color.colorblack));
            }
        });
    }
}
