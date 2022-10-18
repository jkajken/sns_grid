package com.example.sns_grid;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SMViewHolder extends RecyclerView.ViewHolder {
    private ImageView iconImage;
    public SMViewHolder(@NonNull View itemView) {
        super(itemView);

        iconImage = itemView.findViewById(R.id.image_view);
    }
    public void bind(Integer image){
        iconImage.setImageResource(image);
    }
}
