package com.example.oerlex.as223th_assignment1.countryList;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.oerlex.as223th_assignment1.R;

import java.util.ArrayList;
import java.util.List;

public class CountryList extends AppCompatActivity {
    private List<Country> countryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CountryAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_country_list);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_country);

        mAdapter = new CountryAdapter(countryList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareCountryData("Sweden","2014");
        prepareCountryData("Dongland","2016");
    }

    private void prepareCountryData(String name, String date) {
        Country country = new Country(name,date);
        countryList.add(country);
        mAdapter.notifyDataSetChanged();
    }

    public void addCountry(View view){
        Intent intent = new Intent(this,CountryInput.class);
        this.startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String name=data.getStringExtra("name");
                String date=data.getStringExtra("date");
                prepareCountryData(name, date);

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                System.out.println("KEIN RESULTAT");
            }
        }
    }//onActivityResult


}
