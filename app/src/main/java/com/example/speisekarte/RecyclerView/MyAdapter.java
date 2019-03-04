package com.example.speisekarte.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.speisekarte.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public MyViewHolder(CardView c) {
            super(c);
            cardView = c;
        }
    }

    public MyAdapter(String[] myDataset) {
        myDataset = myDataset;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        GridView g = (GridView) LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_cardviews, parent, false);

        MyViewHolder vh = new MyViewHolder(g);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.cardView.set
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
