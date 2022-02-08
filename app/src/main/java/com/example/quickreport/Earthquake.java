package com.example.quickreport;

/**
 * an {@link Earthquake} object contains information related to a single earthquake
 */
public class Earthquake {

    //magnitude of the earthquake
    private double mMagnitude;

    //location of the earthquake
    private String mLocation;

    //date of the earthquake
    private long mTimeInMilliseconds;

    // Website URL of the earthquake
    private String mUrl;

    /**
     * constructor a new {@link Earthquake} object.
     * @param magnitude is the magnitude size of the earthquake.
     * @param location is the city location of the earthquake.
     * @param TimeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long TimeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    //returns the magnitude of the earthquake
    public double getMagnitude(){
        return mMagnitude;
    }

    //returns the location of the earthquake
    public String getLocation(){
        return mLocation;
    }

    //returns the date of the earthquake
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
