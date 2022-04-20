package com.example.adopt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adopt.Model.Kid;
import com.example.adopt.R;

import java.util.ArrayList;

public class KidAdapter extends RecyclerView.Adapter<KidAdapter.KidsViewHolder>{

    Context context;

    ArrayList<Kid> list;

    public KidAdapter(Context context, ArrayList<Kid> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public KidsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.kiditem,parent,false);
        return  new KidsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KidsViewHolder holder, int position) {
        Kid user = list.get(position);
        holder.firstName.setText(user.getFirstName());
        holder.lastName.setText(user.getLastName());
        holder.age.setText(user.getAge());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class KidsViewHolder extends RecyclerView.ViewHolder{
        TextView firstName, lastName, age;

        public KidsViewHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.tvfirstName);
            lastName = itemView.findViewById(R.id.tvlastName);
            age = itemView.findViewById(R.id.tvage);
        }
    }

}
