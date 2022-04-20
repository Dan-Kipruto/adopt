package com.example.adopt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adopt.Adapter.MajorAdapter;
import com.example.adopt.Adapter.MinorAdapter;
import com.example.adopt.Adapter.OrphansAdapter;
import com.example.adopt.Model.Major;
import com.example.adopt.Model.Minor;

import java.util.ArrayList;
import java.util.List;

public class Adoptkids extends AppCompatActivity {
    private RecyclerView mAdopt, mMinor, mMajor, mAdult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoptkids);

        //mAdopt recycler view
        mAdopt = findViewById(R.id.orphans);
        mAdopt.setHasFixedSize(true);
        mAdopt.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<Minor> minorList = new ArrayList<>();
        minorList.add(new Minor(R.drawable.a,"Adopt me"));
        minorList.add(new Minor(R.drawable.boy,"Adopt me"));
        minorList.add(new Minor(R.drawable.gall,"Adopt me"));
        MinorAdapter minorAdapter = new MinorAdapter(minorList);
        mAdopt.setAdapter(minorAdapter);

        //mMinor recycler view

        mMinor = findViewById(R.id.minorKids);
        mMinor.setHasFixedSize(true);
        mMinor.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<Integer>imageList = new ArrayList<>();
        imageList.add(R.drawable.bo);
        imageList.add(R.drawable.gal);
        imageList.add(R.drawable.gall);

        OrphansAdapter orphansAdapter = new OrphansAdapter(imageList);
        mMinor.setAdapter(orphansAdapter);

       //mMajor recycler view
        mMajor = findViewById(R.id.majorKIds);
        mMajor.setHasFixedSize(true);
        mMajor.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<Major>majorList = new ArrayList<>();
        majorList.add(new Major(R.drawable.boy,"donate"));
        majorList.add(new Major(R.drawable.gril,"donate"));
        majorList.add(new Major(R.drawable.kiddo,"donate"));
        MajorAdapter majorAdapter = new MajorAdapter(majorList);
        mMajor.setAdapter(majorAdapter);

        //mAdult recycler view
        mAdult = findViewById(R.id.adults);
        mAdult.setHasFixedSize(true);
        mAdult.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        mAdult.setAdapter(majorAdapter);
    }
}