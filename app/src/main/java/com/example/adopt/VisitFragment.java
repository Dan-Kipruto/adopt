package com.example.adopt;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class VisitFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_visit ,container,false);
        Button  btnvst1 = (Button) view.findViewById(R.id.vst1);
        Button  btnvst2 = (Button) view.findViewById(R.id.vst2);
        Button  btnvst3 = (Button) view.findViewById(R.id.vst3);
        Button  btnvst4 = (Button) view.findViewById(R.id.vst4);
        Button  btnvst5 = (Button) view.findViewById(R.id.vst5);
        Button  btnvst6 = (Button) view.findViewById(R.id.vst6);

        btnvst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Donor.class);
                startActivity(intent);
            }
        });
         btnvst2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getActivity(),Donor.class);
                 startActivity(intent);
             }
         });
        btnvst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Donor.class);
                startActivity(intent);
            }
        });
        btnvst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Donor.class);
                startActivity(intent);
            }
        });
        btnvst5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Donor.class);
                startActivity(intent);
            }
        });
        btnvst6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Donor.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}