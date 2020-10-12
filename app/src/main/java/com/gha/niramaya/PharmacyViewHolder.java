package com.gha.niramaya;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PharmacyViewHolder extends RecyclerView.ViewHolder {
    TextView t1, t2, t3;

    public PharmacyViewHolder(@NonNull View itemView) {
        super(itemView);
        t1 = (TextView) itemView.findViewById(R.id.textView11);
        t2 = (TextView) itemView.findViewById(R.id.textView12);
        t3 = (TextView) itemView.findViewById(R.id.textView13);
    }
}
