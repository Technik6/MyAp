package com.example.myap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment3 extends Fragment {
    private RecyclerView ry;
    private MyAdapter adapter;
    private RecyclerView.LayoutManager layout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);


        ry = view.findViewById(R.id.ry);
        ry.setHasFixedSize(true);

        layout = new LinearLayoutManager(getContext());
        ry.setLayoutManager(layout);

        String[] data = new String[200];
        for (int i = 0;i<200;i++)
        {
            data[i] = "Предмет " + (i + 1);
        }
        adapter = new MyAdapter(data);
        ry.setAdapter(adapter);

        return view;
    }
}
