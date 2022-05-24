package com.example.csc22100_finalproject;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.csc22100_finalproject.databinding.ActivityMainBinding;

//I dont know what this is

public class MainActivity extends AppCompatActivity {

    private  TabLayout tabs;
    private  ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        tabs.setupWithViewPager(viewPager);

        Adapter adapter = new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new fragment1(), "Chest");   //For every tab
        adapter.addFragment(new fragment2(), "Back");
        adapter.addFragment(new fragment3(), "Arms");
        adapter.addFragment(new fragment4(), "Legs");
        adapter.addFragment(new fragment5(), "Shoulders");
        adapter.addFragment(new fragment6(), "Abs" );
        viewPager.setAdapter(adapter);

    }
}
