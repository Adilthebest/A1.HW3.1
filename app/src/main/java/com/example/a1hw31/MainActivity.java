package com.example.a1hw31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a1hw31.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
private ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.recyclerView);
        names = new ArrayList<>();
        names.add("Halk");
        names.add("Spider men");
        names.add("Super men");
        names.add("Capitan america");
        names.add("Adil men");
        names.add("Berserk");
        names.add("Magic");
        names.add("Warrior");
        names.add("Super girl");
        names.add("Batmen");
        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}