package com.example.sns_grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    private ArrayList<Integer> medialist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        medialist.add(R.drawable.youtube);
        medialist.add(R.drawable.git);
        medialist.add(R.drawable.kino);
        medialist.add(R.drawable.instagram);
        medialist.add(R.drawable.music);
        medialist.add(R.drawable.netflix);
        medialist.add(R.drawable.pin);
        medialist.add(R.drawable.spotify);
        medialist.add(R.drawable.telegram);
        medialist.add(R.drawable.tiktok);
        medialist.add(R.drawable.twittwr);
        medialist.add(R.drawable.vk);
        medialist.add(R.drawable.wp);
        medialist.add(R.drawable.tumblr);
        medialist.add(R.drawable.v);
        medialist.add(R.drawable.weapp);

        SMAdapter adapter = new SMAdapter(medialist);
        recyclerView.setAdapter(adapter);
    }
}