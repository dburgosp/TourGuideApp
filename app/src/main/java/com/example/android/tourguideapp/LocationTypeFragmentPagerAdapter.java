package com.example.android.tourguideapp;

/**
 * Created by David on 28/06/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class LocationTypeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int NUM_PAGES = 4;
    private String tabTitles[] = new String[]{"Culture", "Shops", "Food", "Leisure"};
    private Context context;

    public LocationTypeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CultureFragment();
            case 1:
                return new ShoppingFragment();
            case 2:
                return new RestaurantsFragment();
            default:
                return new LeisureFragment();
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position.
        return tabTitles[position];
    }
}