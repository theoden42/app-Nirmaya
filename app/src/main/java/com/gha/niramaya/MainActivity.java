package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int MOVEON = 4000;
    //create animation objects
    Animation topAnimation, bottomAnimation;
    ImageView image;
    TextView name, tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image = findViewById(R.id.iconImage);
        name = findViewById(R.id.nameText);
        tagline = findViewById(R.id.textTagline);
        image.setAnimation(topAnimation);
        name.setAnimation(bottomAnimation);
        tagline.setAnimation(bottomAnimation);
        SharedPreferences signup = getSharedPreferences("SignUpPreferences",MODE_PRIVATE);
        final boolean  what = signup.getBoolean("isFirstRun",true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (what) {
                    Intent intent = new Intent(MainActivity.this, ProfileSignUp.class);
                    getSharedPreferences("SignUpPreferences",MODE_PRIVATE).edit().putBoolean("isFirstRun", false).apply();
                    startActivity(intent);
                    finish();

                }
                else{
                    Intent intent =  new Intent(MainActivity.this, DashBoardActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, MOVEON);


    }
}