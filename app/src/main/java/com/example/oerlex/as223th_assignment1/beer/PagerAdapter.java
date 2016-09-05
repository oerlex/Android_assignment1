package com.example.oerlex.as223th_assignment1.beer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oerlex on 05.09.2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int pos) {
        switch(pos) {

            case 0: return Fragment1.newInstance("FirstFragment, Instance 1");
            case 1: return Fragment2.newInstance("SecondFragment, Instance 2");
            case 2: return Fragment3.newInstance("ThirdFragment, Instance 3");
            case 3: return Fragment4.newInstance("FourthFragment, Instance 4");
            case 4: return Fragment5.newInstance("FifthFragment, Instance 5");
            case 5: return Fragment6.newInstance("ThirdFragment, Instance 6");
            case 6: return Fragment7.newInstance("ThirdFragment, Instance 7");
            default: return Fragment1.newInstance("FirstFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return 7;
    }
}
