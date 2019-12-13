package com.example.uriapp;

public class Earthquake {
    //3 global variable

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    // Cnstruct a new object : {@link Earthquake}
    public Earthquake (String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    public String getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getDate(){
        return mDate;
    }
}
