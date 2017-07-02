package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

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

        // Define the behaviour of the clickable elements.
        LinearLayout category1 = (LinearLayout) findViewById(R.id.main_category_1);
        LinearLayout category2 = (LinearLayout) findViewById(R.id.main_category_2);
        LinearLayout category3 = (LinearLayout) findViewById(R.id.main_category_3);
        LinearLayout category4 = (LinearLayout) findViewById(R.id.main_category_4);
        final Intent intent = new Intent(MainActivity.this, ViewpagerActivity.class);
        category1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category 1 LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                intent.putExtra("category", 1); // Information about the tourist destination.
                startActivity(intent);
            }
        });
        category2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category 2 LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                intent.putExtra("category", 2); // Cultural activities at the tourist destination.
                startActivity(intent);
            }
        });
        category3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category 3 LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                intent.putExtra("category", 3); // Restaurants at the tourist destination.
                startActivity(intent);
            }
        });
        category4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category 4 LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                intent.putExtra("category", 4); // Leisure activities at the tourist destination.
                startActivity(intent);
            }
        });
    }
}
