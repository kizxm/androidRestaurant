package com.epicodus.myrestaurants.models;

import java.util.ArrayList;



public class Restaurant {
    private String name;
    private String phone;
    private String website;
    private double rating;
    private String imageUrl;
    private ArrayList<String> address = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();
    private double latitude;
    private double longitude;

public Restaurant(String name, String phone, String website, double rating, String imageUrl, ArrayList<String> address,
                  ArrayList<String> categories, double latitude, double longitude) {
    this.name = name;
    this.phone = phone;
    this.website = website;
    this.rating = rating;
    this.imageUrl = imageUrl;
    this.address = address;
    this.categories = categories;
    this.latitude = latitude;
    this.longitude = longitude;
}

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public double getRating() {
        return rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}