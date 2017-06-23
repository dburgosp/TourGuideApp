package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private final int NUM_BACKGROUND_IMAGES = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Choose a random background image.
        int mainImageIndex = (int) (Math.random() * NUM_BACKGROUND_IMAGES) + 1;
        String mainImageIndexToString = String.format(Locale.getDefault(), "%02d", mainImageIndex);
        int mainImageId = getResources().getIdentifier("activity_main_bg_" + mainImageIndexToString, "drawable", getPackageName());
        ImageView mainImage = (ImageView) findViewById(R.id.main_background_image);
        mainImage.setImageDrawable(getResources().getDrawable(mainImageId));
    }
}
