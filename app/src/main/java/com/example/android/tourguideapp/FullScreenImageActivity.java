package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FullScreenImageActivity extends AppCompatActivity {
    private int categoryId = 1;
    private int locationId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int resourceId, imageId;
        String imageName;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        // Get parameters.
        categoryId = getIntent().getExtras().getInt("category");
        locationId = getIntent().getExtras().getInt("location");

        // Show the location image.
        ImageView fullScreenImage = (ImageView) findViewById(R.id.full_screen_image);
        resourceId = getResources().getIdentifier("location_image_" + categoryId + "_" + locationId, "string", getPackageName());
        imageName = getResources().getString(resourceId);
        imageId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        fullScreenImage.setImageDrawable(getResources().getDrawable(imageId));

        // Finish activity when image is clicked.
        fullScreenImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
