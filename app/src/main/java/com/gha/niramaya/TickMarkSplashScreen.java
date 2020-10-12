package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TickMarkSplashScreen extends AppCompatActivity {
    String CONDITION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tick_mark_splash_screen);
        ImageView image = findViewById(R.id.tickmark);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            CONDITION =  extras.getString("CONDITION");
        }
        else{
            CONDITION = "NORMAL";
        }
        if(CONDITION.equalsIgnoreCase("NORMAL")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.tickmarkicon));
        }
        else if(CONDITION.equalsIgnoreCase("OVERWEIGHT")||CONDITION.equalsIgnoreCase("UNDERWEIGHT")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.yellowexclamationmarkicon));
        }
        else if(CONDITION.equalsIgnoreCase("OBESE")||CONDITION.equalsIgnoreCase("SEVERE_UNDERWEIGHT")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.redexclamationicon));
        }
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        image.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TickMarkSplashScreen.this, BMI_Teller.class);
                intent.putExtra("CONDITION", CONDITION);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            }
        }, 1500);

    }
}