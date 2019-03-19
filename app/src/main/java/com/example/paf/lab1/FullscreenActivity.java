package com.example.paf.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

public class FullscreenActivity extends AppCompatActivity {

    private RecyclerView rView;
    private RecyclerView.Adapter dAdapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        rView = (RecyclerView) findViewById(R.id.list);
        rView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(this);
        rView.setLayoutManager(lManager);
        dAdapter = new DataAdapter();
        rView.setAdapter(dAdapter);
    }
}
