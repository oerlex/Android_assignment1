package com.example.oerlex.as223th_assignment1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Oerlex on 05.09.2016.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        TextView tv = (TextView) v.findViewById(R.id.fragment1);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static Fragment1 newInstance(String text) {

        Fragment1 f = new Fragment1();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}