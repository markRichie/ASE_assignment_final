package com.kochchi.aseassignmentfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView statusList, recentList;
    private StatusAdapter statusAdapter;
    private  RecentAdapter recentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList<Status> statusData = new LinkedList<>();
        statusData.add(new Status("Approval", 12, Color.parseColor("#E74C3C")));
        statusData.add(new Status("In-Progress", 5, Color.parseColor("#2471A3")));
        statusData.add(new Status("Rejected", 10, Color.parseColor("#117A65")));
        statusData.add(new Status("Completed", 24, Color.parseColor("#CD6155")));

        statusList = findViewById(R.id.workflowStatus);
        statusAdapter = new StatusAdapter(this, statusData);
        statusList.setAdapter(statusAdapter);
        statusList.setLayoutManager(new GridLayoutManager(this, 2));

        LinkedList<Recent> recentData = new LinkedList<>();
        recentData.add(new Recent("Proof reading","proof reading of the uncorrected"));
        recentData.add(new Recent("Proof reading","proof reading of the uncorrected"));
        recentData.add(new Recent("Proof reading","proof reading of the uncorrected"));

        recentList = findViewById(R.id.recent_list);
        recentAdapter = new RecentAdapter(this, recentData);
        recentList.setAdapter(recentAdapter);
        recentList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
