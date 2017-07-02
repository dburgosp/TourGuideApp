package com.example.android.tourguideapp;

/**
 * Created by David on 28/06/2017.
 */

import android.graphics.drawable.Drawable;

/**
 * {@link Location} represents a location or tourist activity that can be shown in the tourist
 * guide.
 */
public class Location {
    private String name;                    // Name of the location.
    private Drawable thumbnailImage;        // Thumbnail image resource for the location.
    private Drawable image = null;          // Main image resource for the location.
    private String address = "";            // Physical address of the tourist location.
    private String contact = "";            // Contact information for the tourist location.
    private String timetable = "";          // Opening hours for the tourist location.
    private String web = "";                // Url of the location official website.
    private String description = "";        // Description of the tourist location.

    /**
     * Create a new Location object with basic information for inflating a list of locations.
     *
     * @param name           is the name of the location.
     * @param thumbnailImage is the thumbnail image resource for the location.
     */
    public Location(String name, Drawable thumbnailImage) {
        this.name = name;
        this.thumbnailImage = thumbnailImage;
    }

    /**
     * Create a new Location object with complete information of the tourist location.
     *
     * @param name        is the name of the location.
     * @param image       is the main image resource for the location.
     * @param address     is the physical address of the tourist location.
     * @param contact     is the contact information for the tourist location.
     * @param timetable   contains a string with the opening hours of the tourist location.
     * @param web         is the url of the location official website.
     * @param description is the description of the tourist location.
     */
    public Location(String name, Drawable image, String address, String contact, String timetable, String web, String description) {
        this.name = name;
        this.image = image;
        this.address = address;
        this.contact = contact;
        this.timetable = timetable;
        this.web = web;
        this.description = description;
    }

    /**
     * Getters.
     */
    public String getName() {
        return name;
    }

    public Drawable getThumbnailImage() {
        return thumbnailImage;
    }

    public Drawable getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getTimetable() {
        return timetable;
    }

    public String getWeb() {
        return web;
    }

    public String getDescription() {
        return description;
    }
}