package com.gha.niramaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Diet extends AppCompatActivity {

    RecyclerView rev;
    DietAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        setTitle("Diet Plan:");

        rev = (RecyclerView) findViewById(R.id.recview);
        rev.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DietAdapter(dataqueue());
        rev.setAdapter(adapter);

    }

    public ArrayList<DietModel> dataqueue() {
        ArrayList<DietModel> holder = new ArrayList<>();
        DietModel ob1 = new DietModel();
        ob1.setText1("Protien Rich");
        ob1.setText2("Kidney Beans (Rajma)");
        ob1.setText3("7.5g per half cup");
        ob1.setText4("Cottage Cheese (Paneer)");
        ob1.setText5("14g per half cup");
        ob1.setImage1(R.drawable.rajma);
        ob1.setImage2(R.drawable.paneer);
        holder.add(ob1);

        DietModel ob3 = new DietModel();
        ob3.setText1("Carbohydrate Rich");
        ob3.setText2("Peeli wali dal");
        ob3.setText3("20g carbs per 100g");
        ob3.setText4("Oatmeal");
        ob3.setText5("67g carbs per 100g");
        ob3.setImage1(R.drawable.peelidal);
        ob3.setImage2(R.drawable.oats);
        holder.add(ob3);

        DietModel ob5 = new DietModel();
        ob5.setText1("Vitamin Rich");
        ob5.setText2("Fish curry");
        ob5.setText3("100 cal. per 100g");
        ob5.setText4("Pumpkin (Kaddu)");
        ob5.setText5("7.2g per 100g");
        ob5.setImage1(R.drawable.fish);
        ob5.setImage2(R.drawable.kaddu);
        holder.add(ob5);

        DietModel ob7 = new DietModel();
        ob7.setText1("Fat Rich");
        ob7.setText2("Bharwa Baigan (Eggplant)");
        ob7.setText3("65 cal. per 100g");
        ob7.setText4("Chicken Masala");
        ob7.setText5("84 cal. per 100g");
        ob7.setImage1(R.drawable.baigan);
        ob7.setImage2(R.drawable.chick);
        holder.add(ob7);

        DietModel ob2 = new DietModel();
        ob2.setText1("Protien Rich");
        ob2.setText2("Soyabean");
        ob2.setText3("32g protien per 100g");
        ob2.setText4("Egg curry");
        ob2.setText5("7.3 g per serving");
        ob2.setImage1(R.drawable.soya);
        ob2.setImage2(R.drawable.egg);
        holder.add(ob2);

        DietModel ob4 = new DietModel();
        ob4.setText1("Carbohydrate Rich");
        ob4.setText2("Sweet Potatoes (Shakkarkandi)");
        ob4.setText3("22g per 100g");
        ob4.setText4("Pumpkin (Kaddu)");
        ob4.setText5("7.2g per 100g");
        ob4.setImage1(R.drawable.shakkarkandi);
        ob4.setImage2(R.drawable.kaddu);
        holder.add(ob4);

        DietModel ob6 = new DietModel();
        ob6.setText1("Vitamin Rich");
        ob6.setText2("Lemon Rasam");
        ob6.setText3("60 cal. per 100g");
        ob6.setText4("Mushroom");
        ob6.setText5("22 cal. per 100g");
        ob6.setImage1(R.drawable.lemon);
        ob6.setImage2(R.drawable.mushrrom);
        holder.add(ob6);

        DietModel ob8 = new DietModel();
        ob8.setText1("Fat Rich");
        ob8.setText2("Navratan Korma");
        ob8.setText3("55 cal. per 100g");
        ob8.setText4("Peanut Butter Sandwich");
        ob8.setText5("70 cal. per 100g");
        ob8.setImage1(R.drawable.navratan);
        ob8.setImage2(R.drawable.peanut);
        holder.add(ob8);


        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.diet_menu, menu);
        MenuItem item = menu.findItem(R.id.diet_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}