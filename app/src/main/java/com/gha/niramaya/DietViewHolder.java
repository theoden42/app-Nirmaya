package com.gha.niramaya;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DietViewHolder extends RecyclerView.ViewHolder {
    TextView t1, t2, t3,t4,t5;
    ImageView i1, i2;

    public DietViewHolder(@NonNull View itemView) {
        super(itemView);
        t1 = (TextView) itemView.findViewById(R.id.textView11);
        t2 = (TextView) itemView.findViewById(R.id.textView12);
        t3 = (TextView) itemView.findViewById(R.id.textView14);
        t4 = (TextView) itemView.findViewById(R.id.textView15);
        t5 = (TextView) itemView.findViewById(R.id.textView17);

        i1 = (ImageView) itemView.findViewById(R.id.img1);
        i2 = (ImageView) itemView.findViewById(R.id.img2);

    }
}
