package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.Objects;

public class ProfileActivity extends AppCompatActivity {

    private long mLastClickTimenow;
    private String CONDITION = "";
    private int CALORIE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView namebox = findViewById(R.id.name);
        TextView agebox = findViewById(R.id.age);
        TextView heightbox = findViewById(R.id.height);
        TextView weightbox = findViewById(R.id.weight);
        TextView genderbox = findViewById(R.id.gender);
        TextView bmibox = findViewById(R.id.bmi_label);
        MaterialCardView bmicard = findViewById(R.id.cardbmi);
        MaterialCardView caloriecard = findViewById(R.id.caloriecard);
        TextView caloriebox = findViewById(R.id.calorie_label);
        SharedPreferences sharedpreferences = getSharedPreferences("SignUpPreferences", MODE_PRIVATE);
        String found = sharedpreferences.getString("name", "Your Name");
        namebox.setText(found);
        found = sharedpreferences.getString("age", "00");
        agebox.setText("Age: " + found + " yrs");
        found = sharedpreferences.getString("height", "00");
        heightbox.setText("Ht: " + found + "cm");
        found = sharedpreferences.getString("weight", "00");
        weightbox.setText("Wt: " + found + "kg");
        found = sharedpreferences.getString("gender", "np");
        if (found.equals("Guy")) {
            genderbox.setText("Male");
        } else if (found.equals("Gal")) {
            genderbox.setText("Female");

        } else if (found.equals("Non Binary Pal")) {
            genderbox.setText("NB");
        } else {
            genderbox.setText("-");
        }
        String gen = found;
        ImageView image =  findViewById(R.id.profilepicture);
        //TODO : Change name of Drawable Resource
        if(gen.equalsIgnoreCase("Guy"))
            image.setImageResource(R.drawable.man);
        else if(gen.equalsIgnoreCase("Gal"))
            image.setImageResource(R.drawable.female);
        else
            image.setImageResource(R.drawable.trans);

        Double bmi = Double.parseDouble(Objects.requireNonNull(sharedpreferences.getString("bmi", "24.0")));
        if (bmi > 16 && bmi < 18.5) {
            bmicard.setCardBackgroundColor(getResources().getColor(R.color.yellow));
            CONDITION = "UNDERWEIGHT";
            if (found.equalsIgnoreCase("Guy"))
                CALORIE = 3000;
            else if (found.equalsIgnoreCase("Gal"))
                CALORIE = 2500;
            else {
                CALORIE =  2600;
            }
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            bmicard.setCardBackgroundColor(getResources().getColor(R.color.green));
            CONDITION = "NORMAL";
            if (found.equalsIgnoreCase("Guy"))
                CALORIE = 2500;
            else if (found.equalsIgnoreCase("Gal"))
                CALORIE = 2000;
            else {
                CALORIE =  2200;
            }
        } else if (bmi > 24.9 && bmi < 28) {
            bmicard.setCardBackgroundColor(getResources().getColor(R.color.yellow));
            CONDITION = "OVERWEIGHT";
            if (found.equalsIgnoreCase("Guy"))
                CALORIE = 2200;
            else if (found.equalsIgnoreCase("Gal"))
                CALORIE = 1700;
            else {
                CALORIE =  1800;
            }
        } else if (bmi >= 28) {
            bmicard.setCardBackgroundColor(getResources().getColor(R.color.red));
            CONDITION = "OBESE";
            if (found.equalsIgnoreCase("Guy"))
                CALORIE = 2000;
            else if (found.equalsIgnoreCase("Gal"))
                CALORIE = 1600;
            else {
                CALORIE =  1700;
            }
        } else {
            bmicard.setCardBackgroundColor(getResources().getColor(R.color.red));
            CONDITION = "SEVERE_UNDERWEIGHT";
            if (found.equalsIgnoreCase("Guy"))
                CALORIE = 3000;
            else if (found.equalsIgnoreCase("Gal"))
                CALORIE = 2500;
            else {
                CALORIE =  2600;
            }
        }
        bmicard.setRadius(20);
        bmibox.setText(sharedpreferences.getString("bmi", "24.0"));
        caloriebox.setText(Integer.toString(CALORIE));
        SharedPreferences.Editor editor  =  sharedpreferences.edit();
        editor.putInt("calories", CALORIE);
        editor.apply();
    }

    public void bmiView(View view) {
        if (SystemClock.elapsedRealtime() - mLastClickTimenow < 1000)
            return;
        Intent intent = new Intent(ProfileActivity.this, TickMarkSplashScreen.class);
        intent.putExtra("CONDITION", CONDITION);
        startActivity(intent);
        mLastClickTimenow = SystemClock.elapsedRealtime();
    }

    public void updateProfile(View view) {
        if (SystemClock.elapsedRealtime() - mLastClickTimenow < 1000)
            return;
        Intent intent = new Intent(ProfileActivity.this, ProfileSignUp.class);
        startActivity(intent);
        finish();
        mLastClickTimenow = SystemClock.elapsedRealtime();
    }

    public void caloriesView(View view) {
        if (SystemClock.elapsedRealtime() - mLastClickTimenow < 1000)
            return;
        Intent intent = new Intent(ProfileActivity.this, Calorie_Teller.class);
        intent.putExtra("CONDITION", CONDITION);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        mLastClickTimenow = SystemClock.elapsedRealtime();
    }

    public void dietView(View view) {
        if (SystemClock.elapsedRealtime() - mLastClickTimenow < 1000)
            return;
        Intent intent = new Intent(ProfileActivity.this, Diet.class);
        startActivity(intent);
        mLastClickTimenow = SystemClock.elapsedRealtime();
    }

}