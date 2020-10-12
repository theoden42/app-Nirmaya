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

public class DoctorAdapter extends RecyclerView.Adapter<DoctorViewHolder> implements Filterable {
    ArrayList<DoctorModel> data;
    ArrayList<DoctorModel> dataunfiltered;

    public DoctorAdapter(ArrayList<DoctorModel> data) {
        this.data = data;
        this.dataunfiltered = new ArrayList<>(data);
    }

    @NonNull
    @Override
    public DoctorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.doctors, parent, false);
        return new DoctorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorViewHolder holder, int position) {

        holder.t1.setText(data.get(position).getText1());
        holder.t2.setText(data.get(position).getText2());
        holder.t3.setText(data.get(position).getText3());

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

            ArrayList<DoctorModel> filteredList = new ArrayList<>();
            if (constraint.toString().isEmpty()) {
                filteredList.addAll(dataunfiltered);
            } else {
                for (DoctorModel dl : dataunfiltered) {
                    if (dl.getText1().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText2().toLowerCase().contains(constraint.toString().toLowerCase().trim()) || dl.getText3().toLowerCase().contains(constraint.toString().toLowerCase().trim())) {
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
            data.addAll((Collection<? extends DoctorModel>) results.values);
            notifyDataSetChanged();
        }
    };
}
