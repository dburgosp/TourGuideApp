package com.example.android.tourguideapp;

/**
 * Created by David on 28/06/2017.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {
    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location} objects to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list.
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID list_item_name, get the
        // location name from the currentLocation object and set this text on the TextView.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        locationTextView.setText(currentLocation.getName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_image and display
        // the provided image based on the resource ID.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        imageView.setImageDrawable(currentLocation.getThumbnailImage());

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}