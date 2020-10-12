package com.gha.niramaya;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class DataAdapterCalorie extends PagerAdapter {

    private Context context;
    private ArrayList<DataHolderBMI> arrayList;

    public DataAdapterCalorie(Context context, ArrayList<DataHolderBMI> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.cards_in_bmi_activity, container, false);
        ImageView bmi_card_image = view.findViewById(R.id.bmi_card_image);
        TextView bmi_card_text1 = view.findViewById(R.id.bmi_card_text1);
        TextView bmi_card_text2 = view.findViewById(R.id.bmi_card_text2);
        DataHolderBMI model = arrayList.get(position);
        String title = model.getTITLE();
        String description = model.getTITLE_CONTENT();
        int image = model.getIMAGE();
        bmi_card_image.setImageResource(image);
        bmi_card_text1.setText(title);
        bmi_card_text2.setText(description);
        final int pos = position;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pos == 6)
                {
                    Intent intent =  new Intent(context, DoctorsActivity.class);
                    context.startActivity(intent);
                }
            }
        });
        container.addView (view, position);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
