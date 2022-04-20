package com.example.adopt.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adopt.R;

import java.util.List;

public class OrphansAdapter extends RecyclerView.Adapter<OrphansAdapter.OrphansViewHolder> {
    private List<Integer> imageList;

    public OrphansAdapter(List<Integer> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public OrphansViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.minor, parent, false);
        return new OrphansViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrphansViewHolder holder, int position) {
        holder.mImageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class OrphansViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public OrphansViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.minorI);
        }
    }

}
