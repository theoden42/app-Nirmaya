package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFrontLine extends AppCompatActivity {
    private static int MOVEON = 6000;
    //create animation objects
    Animation topAnimation, bottomAnimation;
    ImageView image;
    TextView name, tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_front_line);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image = findViewById(R.id.iconImagefront);
        name = findViewById(R.id.nameTextfront);
        tagline = findViewById(R.id.textTaglinefront);
        image.setAnimation(topAnimation);
        name.setAnimation(bottomAnimation);
        tagline.setAnimation(bottomAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, MOVEON);


    }
}