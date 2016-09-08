package com.example.oerlex.as223th_assignment1.beer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.oerlex.as223th_assignment1.R;

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
            case 0: return Fragment1.newInstance(EnumBeers.norrlands, R.drawable.norrlands);
            case 1: return Fragment1.newInstance(EnumBeers.goodMorning, R.drawable.goodmorning);
            case 2: return Fragment1.newInstance(EnumBeers.headyTopper,R.drawable.heady_topper);
            case 3: return Fragment1.newInstance(EnumBeers.kentuckyBrunchBrandStout,R.drawable.kentucky_brunch_brand_stout);
            case 4: return Fragment1.newInstance(EnumBeers.morninDelight,R.drawable.morning_delight);
            case 5: return Fragment1.newInstance(EnumBeers.plinyTheOlder, R.drawable.pliny_the_elder);
            case 6: return Fragment1.newInstance(EnumBeers.plinyTheYounger, R.drawable.pliny_the_younger);
            default: return Fragment1.newInstance(EnumBeers.kentuckyBrunchBrandStout,R.drawable.kentucky_brunch_brand_stout);
        }
    }

    @Override
    public int getCount() {
        return 7;
    }
}
