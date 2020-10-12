package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

public class DashBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        SharedPreferences sharedPreferences =  getSharedPreferences("SignUpPreferences",MODE_PRIVATE);
        String gen = sharedPreferences.getString("gender", "NB");
        ImageView image =  findViewById(R.id.profile);

        if(gen.equalsIgnoreCase("Guy"))
            image.setImageResource(R.drawable.man);
        else if(gen.equalsIgnoreCase("Gal"))
            image.setImageResource(R.drawable.female);
        else
            image.setImageResource(R.drawable.trans);

    }
    private long mLastClickTime=0;

    public void clickProfilePage(View view) {
        Intent intent = new Intent(DashBoardActivity.this, ProfileActivity.class);
        Pair[] pair = new Pair[1];
        ImageView image = findViewById(R.id.profile);
        if(SystemClock.elapsedRealtime()-mLastClickTime<1000)
            return;
        pair[0] = new Pair<View, String>(image, "profiletrans");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(DashBoardActivity.this, pair);
        startActivity(intent, options.toBundle());
        mLastClickTime=SystemClock.elapsedRealtime();
    }

    public void clickDoctorsPage(View view) {
        Intent intent = new Intent(DashBoardActivity.this, DoctorsActivity.class);
        ImageView image1 = findViewById(R.id.doc);
        if (SystemClock.elapsedRealtime()-mLastClickTime<1000)
            return;
        startActivity(intent);
        mLastClickTime=SystemClock.elapsedRealtime();
    }

    public void clickPharmacyPage(View view) {
        Intent intent = new Intent(DashBoardActivity.this, PharmacyActivity.class);
        ImageView image2 = findViewById(R.id.pharm);
        if (SystemClock.elapsedRealtime()-mLastClickTime<1000)
            return;
        startActivity(intent);
        mLastClickTime=SystemClock.elapsedRealtime();
    }

    public void clickAboutPage(View view) {
        Intent intent = new Intent(DashBoardActivity.this, AboutActivity.class);
        ImageView image3 = findViewById(R.id.abt);
        if (SystemClock.elapsedRealtime()-mLastClickTime<1000)
            return;
        startActivity(intent);
        mLastClickTime=SystemClock.elapsedRealtime();
    }

    public void clickYogaPage(View view) {
        Intent intent = new Intent(DashBoardActivity.this, YogaActivity.class);
        Pair[] pair = new Pair[1];
        ImageView image4 = findViewById(R.id.yoga);
        if (SystemClock.elapsedRealtime()-mLastClickTime<1000)
            return;
        pair[0] = new Pair<View, String>(image4, "yogatrans");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(DashBoardActivity.this, pair);
        startActivity(intent, options.toBundle());
        mLastClickTime=SystemClock.elapsedRealtime();
    }
}