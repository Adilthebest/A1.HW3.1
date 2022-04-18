package com.example.a1hw31;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder>{

    public NameAdapter(ArrayList<String> data) {
        this.data = data;
    }

    private ArrayList<String> data = new ArrayList<>();
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder( LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
