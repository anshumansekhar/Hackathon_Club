package com.example.anshuman_hp.qazwsxedc;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TabLayout tabLayout;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        pager=(ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new pageradapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(pager);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setAdapter(new adapter(getApplicationContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
    }
}
