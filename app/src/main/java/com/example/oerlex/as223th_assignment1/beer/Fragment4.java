package com.example.oerlex.as223th_assignment1.beer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oerlex.as223th_assignment1.R;

public class Fragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment4, container, false);

        TextView tv = (TextView) v.findViewById(R.id.fragment4);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static Fragment4 newInstance(String text) {
        Fragment4 f = new Fragment4();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
