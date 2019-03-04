package com.example.speisekarte.RecyclerView;


import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.speisekarte.MainActivity;
import com.example.speisekarte.R;

public class RecyclerLayoutManager extends MainActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cardviews);
        recyclerView = (RecyclerView) findViewById(R.id.rv_cardviews);

        //so the content doesn't change the size
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, GridLayoutManager.DEFAULT_SPAN_COUNT, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }
}
