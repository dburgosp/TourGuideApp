package com.example.android.tourguideapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of culture activities at the tourist destination.
 */
public class ShoppingFragment extends Fragment {
    private final int NUM_LOCATIONS = 10;
    private final int LOCATION_TYPE = 2;

    public ShoppingFragment() {
        // Required empty public constructor.
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        String name, imageName;
        Drawable image;
        int resourceId, imageId;

        // Create a list of culture locations.
        final ArrayList<Location> locations = new ArrayList<>();
        for (int n = 1; n <= NUM_LOCATIONS; n++) {
            // Get the location name.
            resourceId = getResources().getIdentifier("location_name_" + LOCATION_TYPE + "_" + n, "string", getActivity().getPackageName());
            name = getResources().getString(resourceId);

            // Get the location thumbnail image.
            resourceId = getResources().getIdentifier("location_thumbnail_" + LOCATION_TYPE + "_" + n, "string", getActivity().getPackageName());
            imageName = getResources().getString(resourceId);
            imageId = getResources().getIdentifier(imageName, "drawable", getActivity().getPackageName());
            image = getResources().getDrawable(imageId);

            // Add the new location to the list.
            locations.add(new Location(name, image));
        }

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}
        // objects. The adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Starts a new activity in order to show details of the current location.
                Intent intent = new Intent(getActivity(), LocationDetailsActivity.class);
                intent.putExtra("category", LOCATION_TYPE);
                intent.putExtra("location", position + 1);
                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }
}