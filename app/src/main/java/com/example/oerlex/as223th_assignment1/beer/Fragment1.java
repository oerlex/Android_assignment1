package com.example.oerlex.as223th_assignment1.beer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oerlex.as223th_assignment1.R;

import org.w3c.dom.Text;

/**
 * Created by Oerlex on 05.09.2016.
 */
public class Fragment1 extends Fragment {

    ImageView imageView;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        textView = (TextView) v.findViewById(R.id.textViewBeer);
        textView.setText(getArguments().getString("text"));

        imageView = (ImageView) v.findViewById(R.id.imageViewBeer);
        imageView.setImageResource(getArguments().getInt("image"));

        return v;
    }

    public static Fragment1 newInstance(EnumBeers enumBeers,int image) {
        Fragment1 f = new Fragment1();
        Bundle b = new Bundle();

        b.putString("text",enumBeers.toString());
        b.putInt("image",image);

        f.setArguments(b);

        return f;
    }
}