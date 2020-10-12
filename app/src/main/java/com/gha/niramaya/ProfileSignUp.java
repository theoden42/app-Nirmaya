package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ProfileSignUp extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinnergen;
    private EditText name, age, height, weight;
    public final String SHARED_PREFS = "SignUpPreferences";
    public final String NAME = "name";
    public final String HEIGHT = "height";
    public final String WEIGHT = "weight";
    public final String AGE = "age";
    public final String GENDER = "gender";
    public final String BMI = "bmi";
    private String gender_choice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_sign_up);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        height.setText(sharedPreferences.getString("height", ""));
        weight.setText(sharedPreferences.getString("weight", ""));
        name.setText(sharedPreferences.getString("name", ""));
        age.setText(sharedPreferences.getString("age", ""));
        spinnergen = findViewById(R.id.genderspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genders, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnergen.setAdapter(adapter);
        spinnergen.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = (ArrayAdapter) spinnergen.getAdapter();
        spinnergen.setSelection(arrayAdapter.getPosition(sharedPreferences.getString("gender", "Guy")));
    }

    public void onImageClick(View view) {
        Intent intent = new Intent(ProfileSignUp.this, PageFrontLine.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String choice = adapterView.getItemAtPosition(i).toString();
        gender_choice = choice;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onSubmit(View view) {
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        if (checkData()) {
            saveData();
            Intent intent = new Intent(ProfileSignUp.this, DashBoardActivity.class);
            startActivity(intent);
            finishAffinity();
        } else {
            Toast toast = Toast.makeText(this, "Invalid Data", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public boolean checkData() {
        try {
            float d = Float.parseFloat(height.getText().toString());
            d = Float.parseFloat(weight.getText().toString());
            d = Float.parseFloat(age.getText().toString());
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (name.getText().toString().trim().replaceAll(" ", "").length() <= 0 || name.getText().toString().trim().length() > 50)
            return false;
        else if ((Float.parseFloat(height.getText().toString())) <= 25 || (Float.parseFloat(height.getText().toString())) > 250)
            return false;
        else if ((Float.parseFloat(weight.getText().toString())) < 1.5 || (Float.parseFloat(weight.getText().toString())) > 500)
            return false;
        else if ((Float.parseFloat(age.getText().toString())) <=0 || (Float.parseFloat(weight.getText().toString())) > 150)
            return false;
        else
            return true;
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Double w = Double.parseDouble(weight.getText().toString());
        Double h = Double.parseDouble(height.getText().toString()) / 100.0;
        Double b = (w / Math.pow(h, 2));
        b = Math.round(b * 10) / 10.0;
        editor.putString(BMI, Double.toString(b));
        editor.putString(NAME, name.getText().toString());
        editor.putString(HEIGHT, height.getText().toString());
        editor.putString(WEIGHT, weight.getText().toString());
        editor.putString(AGE, age.getText().toString());
        editor.putString(GENDER, gender_choice);
        editor.apply();
    }
}