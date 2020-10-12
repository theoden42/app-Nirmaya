package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Objects;

public class Calorie_Teller extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<DataHolderBMI> holderArray;
    private DataAdapterCalorie dataAdapterCalorie;
    private String CONDITION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie__teller);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        viewPager = findViewById(R.id.viewpagercalorie);
        viewPager.setOffscreenPageLimit(3);
        holderArray = new ArrayList<DataHolderBMI>();
        SharedPreferences sharedPreferences = getSharedPreferences("SignUpPreferences", MODE_PRIVATE);
        int calories = sharedPreferences.getInt("calories", 2500);
        String gender = sharedPreferences.getString("gender", "Guy");
        if (gender.equalsIgnoreCase("Guy"))
            holderArray.add(new DataHolderBMI("HOW MANY CALORIES?", "Since, you identify as Male, it is recommended that you eat around 2500 Kcal a day.", R.drawable.calorieimage));
        else if (gender.equalsIgnoreCase("Gal"))
            holderArray.add(new DataHolderBMI("HOW MANY CALORIES?", "Since, you identify as Female, it is recommended that you eat around 2000 Kcal a day.", R.drawable.calorieimage));
        else if (gender.equalsIgnoreCase("NB"))
            holderArray.add(new DataHolderBMI("HOW MANY CALORIES?", "Since, you identify as Non- Binary, it is recommended that you eat around 2200 Kcal a day.", R.drawable.calorieimage));
        else
            holderArray.add(new DataHolderBMI("HOW MANY CALORIES?", "Since, you identify as Male, it is recommended that you eat around 2500 Kcal a day.", R.drawable.calorieimage));

        Double bmi = Double.parseDouble(Objects.requireNonNull(sharedPreferences.getString("bmi", "24.0")));
        if (bmi > 16 && bmi < 18.5) {
            holderArray.add(new DataHolderBMI("FOR YOU?", "Your BMI indicates that you are Underweight. To gain weight consume more calories, precisely: " + calories + " Kcal", R.drawable.questionmarkicon));
            if (gender.equalsIgnoreCase("Guy"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Underweight male, to gain weight at rate of 1 pound a week you need 375gm of Carbohydrates.", R.drawable.carbohydrates));
            else if (gender.equalsIgnoreCase("Gal"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Underweight female, to gain weight at rate of 1 pound a week you need 325gm of Carbohydrates.", R.drawable.carbohydrates));
            else
                holderArray.add(new DataHolderBMI("CARBS", "You are underweight Non Binary, to gain weight at rate of 1 pound a week you need average 350 gm of Carbohydrates", R.drawable.carbohydrates));

        } else if (bmi >= 18.5 && bmi <= 24.9) {

            holderArray.add(new DataHolderBMI("FOR YOU?", "Your BMI indicates that you are fit. Consume as much calorie as mentioned before and you will maintain your weight.", R.drawable.questionmarkicon));
            if (gender.equalsIgnoreCase("Guy"))
                holderArray.add(new DataHolderBMI("CARBS", "You are fit male, you need 325gm of Carbohydrates to maintain your weight.", R.drawable.carbohydrates));
            else if (gender.equalsIgnoreCase("Gal"))
                holderArray.add(new DataHolderBMI("CARBS", "You are fit female, you need 275gm of Carbohydrates to maintain your weight.", R.drawable.carbohydrates));
            else
                holderArray.add(new DataHolderBMI("CARBS", "You are fit Non Binary, you need average 300 gm of Carbohydrates to maintain your weight ", R.drawable.carbohydrates));
        } else if (bmi > 24.9 && bmi < 28) {
            holderArray.add(new DataHolderBMI("FOR YOU?", "Your BMI indicates that you are Overweight. To lose weight consume less calories, precisely: " + calories + " Kcal", R.drawable.questionmarkicon));
            if (gender.equalsIgnoreCase("Guy"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Overweight male, to lose weight at rate of 1 pound a week you need 250gm of Carbohydrates.", R.drawable.carbohydrates));
            else if (gender.equalsIgnoreCase("Gal"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Overweight female, to lose weight at rate of 1 pound a week you need 300gm of Carbohydrates.", R.drawable.carbohydrates));
            else
                holderArray.add(new DataHolderBMI("CARBS", "You are Overweight Non Binary, to lose weight at rate of 1 pound a week you need average 275 gm of Carbohydrates", R.drawable.carbohydrates));
        } else if (bmi >= 28) {
            holderArray.add(new DataHolderBMI("FOR YOU?", "Your BMI indicates that you are Obese. To lose weight consume less calories, precisely: " + calories + " Kcal", R.drawable.questionmarkicon));
            if (gender.equalsIgnoreCase("Guy"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Obese male, to lose weight at rate of 1 pound a week you need 250gm of Carbohydrates.", R.drawable.carbohydrates));
            else if (gender.equalsIgnoreCase("Gal"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Obese female, to lose weight at rate of 1 pound a week you need 200gm of Carbohydrates.", R.drawable.carbohydrates));
            else
                holderArray.add(new DataHolderBMI("CARBS", "You are Obese Non Binary, to lose weight at rate of 1 pound a week you need average 225gm of Carbohydrates", R.drawable.carbohydrates));
        } else {
            holderArray.add(new DataHolderBMI("FOR YOU?", "Your BMI indicates that you are severely underweight. To gain weight you have to consume more calories, precisely: " + calories + " Kcal", R.drawable.questionmarkicon));
            if (gender.equalsIgnoreCase("Guy"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Severely Underweight male, to gain weight at rate of 1 pound a week you need 400gm of Carbohydrates.", R.drawable.carbohydrates));
            else if (gender.equalsIgnoreCase("Gal"))
                holderArray.add(new DataHolderBMI("CARBS", "You are Severely Underweight female, to gain weight at rate of 1 pound a week you need 350gm of Carbohydrates.", R.drawable.carbohydrates));
            else
                holderArray.add(new DataHolderBMI("CARBS", "You are Severely underweight Non Binary, to gain weight at rate of 1 pound a week you need average 375 gm of Carbohydrates", R.drawable.carbohydrates));
        }

        int fat = (int) (((double) calories * 0.3) / 10.0);
        holderArray.add(new DataHolderBMI("FAT", "For a healthy individual, 30% of calories need to be from fat. Hence fat required for you:" + fat + "gm", R.drawable.faticon));
        int protein = (int) (0.8 * Double.parseDouble(sharedPreferences.getString("weight", "80")));
        holderArray.add(new DataHolderBMI("PROTEIN", "Ideal protein intake for an individual is 0.8 gms per kg of weight. Therefore for you, protein consumption should be: " + protein + "gm.", R.drawable.proteinicon));
        holderArray.add(new DataHolderBMI("VITAMINS", "They are an important part of diet, and are required in small quantities to build immunity. Make sure you include these in your diet.", R.drawable.vitaminicon));
        holderArray.add(new DataHolderBMI("CAUTION!!!", getString(R.string.caution), R.drawable.doctorsicon));
        dataAdapterCalorie = new DataAdapterCalorie(Calorie_Teller.this, holderArray);
        viewPager.setAdapter((dataAdapterCalorie));
        viewPager.setPadding(100, 1, 100, 0);
    }
}