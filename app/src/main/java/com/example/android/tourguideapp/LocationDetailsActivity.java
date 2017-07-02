package com.example.android.tourguideapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LocationDetailsActivity extends AppCompatActivity {
    Location location;
    private int categoryId = 1;
    private int locationId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        // Get parameters.
        categoryId = getIntent().getExtras().getInt("category");
        locationId = getIntent().getExtras().getInt("location");

        // Set activity label.
        switch (categoryId) {
            case 1: // Culture.
                setTitle(getResources().getString(R.string.category_extended_1) + " " + getResources().getString(R.string.city_name));
                break;
            case 2: // Shopping.
                setTitle(getResources().getString(R.string.category_extended_2) + " " + getResources().getString(R.string.city_name));
                break;
            case 3: // Restaurants.
                setTitle(getResources().getString(R.string.category_extended_3) + " " + getResources().getString(R.string.city_name));
                break;
            case 4: // Leisure.
                setTitle(getResources().getString(R.string.category_extended_4) + " " + getResources().getString(R.string.city_name));
                break;

        }

        // Get location data.
        getLocationData();

        // Display location data on the current layout.
        ImageView imageView = (ImageView) findViewById(R.id.location_image);
        imageView.setImageDrawable(location.getImage());
        TextView nameTextView = (TextView) findViewById(R.id.location_name);
        nameTextView.setText(location.getName());
        TextView addressTextView = (TextView) findViewById(R.id.location_address);
        addressTextView.setText(location.getAddress());
        TextView contactTextView = (TextView) findViewById(R.id.location_contact);
        contactTextView.setText(location.getContact());
        TextView timetableTextView = (TextView) findViewById(R.id.location_timetable);
        timetableTextView.setText(location.getTimetable());
        TextView webTextView = (TextView) findViewById(R.id.location_web);
        webTextView.setText(location.getWeb());
        TextView descriptionTextView = (TextView) findViewById(R.id.location_description);
        descriptionTextView.setText(location.getDescription());

        // Define behaviour of the buttons.
        RelativeLayout gotoWeb = (RelativeLayout) findViewById(R.id.goto_location_web);
        RelativeLayout gotoMap = (RelativeLayout) findViewById(R.id.goto_location_map);
        gotoWeb.setOnClickListener(new View.OnClickListener() {
            // Open the web browser and go to the official website of the tourist location.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(location.getWeb()));
                startActivity(intent);
            }
        });
        gotoMap.setOnClickListener(new View.OnClickListener() {
            // Show the map with the physical address of the tourist location in a external app.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=" + location.getName() + ", " + getResources().getString(R.string.city_name)));
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            // Show location image in full screen.
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(LocationDetailsActivity.this, FullScreenImageActivity.class);
                intent.putExtra("category", categoryId);
                intent.putExtra("location", locationId);
                startActivity(intent);
            }
        });
    }

    private void getLocationData() {
        int resourceId, imageId;
        String name, imageName, address, contact, timetable, web, description;
        Drawable image;

        // Get the location name.
        resourceId = getResources().getIdentifier("location_name_" + categoryId + "_" + locationId, "string", getPackageName());
        name = getResources().getString(resourceId);

        // Get the location main image.
        resourceId = getResources().getIdentifier("location_image_" + categoryId + "_" + locationId, "string", getPackageName());
        imageName = getResources().getString(resourceId);
        imageId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        image = getResources().getDrawable(imageId);

        // Get the location address.
        resourceId = getResources().getIdentifier("location_address_" + categoryId + "_" + locationId, "string", getPackageName());
        address = getResources().getString(resourceId);

        // Get the location contact.
        resourceId = getResources().getIdentifier("location_contact_" + categoryId + "_" + locationId, "string", getPackageName());
        contact = getResources().getString(resourceId);

        // Get the location timetable.
        resourceId = getResources().getIdentifier("location_timetable_" + categoryId + "_" + locationId, "string", getPackageName());
        timetable = getResources().getString(resourceId);

        // Get the location web.
        resourceId = getResources().getIdentifier("location_web_" + categoryId + "_" + locationId, "string", getPackageName());
        web = getResources().getString(resourceId);

        // Get the location description.
        resourceId = getResources().getIdentifier("location_description_" + categoryId + "_" + locationId, "string", getPackageName());
        description = getResources().getString(resourceId);

        // Create the location object.
        location = new Location(name, image, address, contact, timetable, web, description);
    }
}
