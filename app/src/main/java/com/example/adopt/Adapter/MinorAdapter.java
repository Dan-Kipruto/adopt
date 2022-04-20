package com.example.adopt.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adopt.Model.Minor;
import com.example.adopt.R;

import java.util.List;

public class MinorAdapter extends RecyclerView.Adapter<MinorAdapter.MinorViewHolder> {
    private List<Minor> minorList;
    public MinorAdapter(List<Minor> minorList) {
        this.minorList = minorList;
    }
    @NonNull
    @Override
    public MinorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orphans, parent, false);
        return new MinorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MinorViewHolder holder, int position) {
        holder.offer.setText(minorList.get(position).getOffer());
        holder.mImageView.setImageResource(minorList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return minorList.size();
    }

    public class MinorViewHolder extends RecyclerView.ViewHolder {
        private TextView offer;
        private ImageView mImageView;

        public MinorViewHolder(@NonNull View itemView) {
            super(itemView);
            offer = itemView.findViewById(R.id.minorKidtext);
            mImageView = itemView.findViewById(R.id.cardIMg1);
        }
    }


}
