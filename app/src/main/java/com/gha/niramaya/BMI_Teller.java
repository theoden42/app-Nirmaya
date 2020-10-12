package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class BMI_Teller extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<DataHolderBMI> holderArray;
    private DataAdapterBMI dataAdapterBMI;
    private String CONDITION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i__teller);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager = findViewById(R.id.viewpagerbmi);
        holderArray = new ArrayList<DataHolderBMI>();
        Bundle bs = getIntent().getExtras();
        if (bs != null) {
            CONDITION = bs.getString("CONDITION", "Normal");
        } else {
            CONDITION = "Normal";
        }
        holderArray.add(new DataHolderBMI(getString(R.string.title_BMI), getString(R.string.what_is_bmi), R.drawable.bmi_image));
        if (CONDITION.equalsIgnoreCase("NORMAL")) {
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Normal), R.drawable.dumbellicon));
        } else if (CONDITION.equalsIgnoreCase("OVERWEIGHT")) {
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Overweight), R.drawable.dumbellicon));
        } else if (CONDITION.equalsIgnoreCase("OBESE")) {
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Obese), R.drawable.dumbellicon));
        } else if (CONDITION.equalsIgnoreCase("SEVERE_UNDERWEIGHT")) {
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Severe_Underweight), R.drawable.dumbellicon));
        } else if (CONDITION.equalsIgnoreCase("UNDERWEIGHT"))
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Underweight), R.drawable.dumbellicon));
        else
            holderArray.add(new DataHolderBMI("YOUR HEALTH", getString(R.string.Normal), R.drawable.dumbellicon));

        holderArray.add(new DataHolderBMI("CAUTION!!!", getString(R.string.caution), R.drawable.doctorsicon));

        holderArray.add(new DataHolderBMI("HOW MUCH?", getString(R.string.Calories), R.drawable.calorieimage));

        holderArray.add(new DataHolderBMI("WHAT TO EAT?", getString(R.string.diet_help), R.drawable.balanceddieticon));

        dataAdapterBMI = new DataAdapterBMI(BMI_Teller.this, holderArray);

        viewPager.setAdapter(dataAdapterBMI);

        viewPager.setPadding(100, 0, 100, 0);


    }


}