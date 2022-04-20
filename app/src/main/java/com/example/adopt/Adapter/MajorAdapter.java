package com.example.adopt.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adopt.Model.Major;
import com.example.adopt.R;

import java.util.List;

public class MajorAdapter extends RecyclerView.Adapter<MajorAdapter.MajorViewHolder> {
    private List<Major> majorList;

    public MajorAdapter(List<Major> majorList) {
        this.majorList = majorList;
    }

    @NonNull
    @Override
    public MajorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.major_kids, parent, false);
        return new MajorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MajorViewHolder holder, int position) {
        holder.mText.setText(majorList.get(position).getOffer());
        holder.mImageview.setImageResource(majorList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return majorList.size();
    }

    public class MajorViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageview;
        private TextView mText;

        public MajorViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageview = itemView.findViewById(R.id.MajorImage);
            mText = itemView.findViewById(R.id.cardMajorkid);
        }
    }
}
