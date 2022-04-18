package com.example.a1hw31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
    }

    public void bind(String nameValue) {
        name.setText(nameValue);
    }
}
