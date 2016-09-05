package com.example.oerlex.as223th_assignment1.beer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oerlex.as223th_assignment1.R;

public class Fragment7 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment7, container, false);

        TextView tv = (TextView) v.findViewById(R.id.fragment7);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static Fragment7 newInstance(String text) {
        Fragment7 f = new Fragment7();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
