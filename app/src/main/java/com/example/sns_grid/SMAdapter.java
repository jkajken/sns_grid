package com.example.sns_grid;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SMAdapter extends RecyclerView.Adapter<SMViewHolder> {
    private ArrayList <Integer> medialist ;

    public SMAdapter(ArrayList<Integer> medialist) {
        this.medialist = medialist;
    }

    @NonNull
    @Override
    public SMViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SMViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.social_media_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SMViewHolder holder, int position) {
        holder.bind(medialist.get(position));

    }

    @Override
    public int getItemCount() {
        return medialist.size();
    }
}
