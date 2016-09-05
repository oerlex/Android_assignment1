package com.example.oerlex.as223th_assignment1.countryList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oerlex.as223th_assignment1.R;

import java.util.List;

/**
 * Created by Oerlex on 31.08.2016.
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {

        private List<Country> countryList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name, date;

            public MyViewHolder(View view) {
                super(view);
                name = (TextView) view.findViewById(R.id.name);
                date = (TextView) view.findViewById(R.id.date);
            }
        }
        public CountryAdapter(List<Country> countryList) {
            this.countryList = countryList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_country_row, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
        Country country = countryList.get(position);
            holder.name.setText(country.getName());
            holder.date.setText(country.getDate());
        }

        @Override
        public int getItemCount() {
            return countryList.size();
        }
}


