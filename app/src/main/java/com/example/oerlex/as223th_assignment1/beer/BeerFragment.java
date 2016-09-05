package com.example.oerlex.as223th_assignment1.beer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.oerlex.as223th_assignment1.R;
import com.example.oerlex.as223th_assignment1.beer.PagerAdapter;

public class BeerFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_fragment);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }
}
