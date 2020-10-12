package com.gha.niramaya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;

public class DietAdapter extends RecyclerView.Adapter<DietViewHolder> implements Filterable {
    ArrayList<DietModel> data;
    ArrayList<DietModel> dataunfiltered;

    public DietAdapter(ArrayList<DietModel> data) {
        this.data = data;
        this.dataunfiltered = new ArrayList<>(data);
    }

    @NonNull
    @Override
    public DietViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.diet, parent, false);
        return new DietViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DietViewHolder holder, int position) {

        holder.t1.setText(data.get(position).getText1());
        holder.t2.setText(data.get(position).getText2());
        holder.t3.setText(data.get(position).getText3());
        holder.t4.setText(data.get(position).getText4());
        holder.t5.setText(data.get(position).getText5());
        holder.i1.setImageResource(data.get(position).getImage1());
        holder.i2.setImageResource(data.get(position).getImage2());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        //run on background
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            ArrayList<DietModel> filteredList = new ArrayList<>();
            if (constraint.toString().isEmpty()) {
                filteredList.addAll(dataunfiltered);
            } else {
                for (DietModel dl : dataunfiltered) {
                    if (dl.getText1().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText2().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText3().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText4().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText5().toLowerCase().contains(constraint.toString().toLowerCase().trim())) {
                        filteredList.add(dl);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        //run in ui
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            data.clear();
            data.addAll((Collection<? extends DietModel>) results.values);
            notifyDataSetChanged();
        }
    };
}
