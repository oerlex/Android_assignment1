package com.example.oerlex.as223th_assignment1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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

            case 0: return FirstFragment.newInstance("FirstFragment, Instance 1");
            case 1: return SecondFragment.newInstance("SecondFragment, Instance 1");
            case 2: return ThirdFragment.newInstance("ThirdFragment, Instance 1");
            case 3: return ThirdFragment.newInstance("ThirdFragment, Instance 2");
            case 4: return ThirdFragment.newInstance("ThirdFragment, Instance 3");
            default: return ThirdFragment.newInstance("ThirdFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
