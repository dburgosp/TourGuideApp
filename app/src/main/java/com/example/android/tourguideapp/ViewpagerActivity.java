package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ViewpagerActivity extends AppCompatActivity {
    private int category = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_viewpager.xml layout file.
        setContentView(R.layout.activity_viewpager);

        // Set label for this activity.
        setTitle(getResources().getString(R.string.city_name) + " " + getResources().getString(R.string.app_name));

        // Get parameters.
        category = getIntent().getExtras().getInt("category");

        // Find the view pager that will allow the user to swipe between fragments.
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page.
        LocationTypeFragmentPagerAdapter adapter = new LocationTypeFragmentPagerAdapter(getSupportFragmentManager(), ViewpagerActivity.this);

        // Set the adapter onto the view pager and go to the current page.
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(category - 1);

        // Give the TabLayout the ViewPager.
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
