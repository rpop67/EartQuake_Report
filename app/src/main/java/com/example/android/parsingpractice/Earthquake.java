package com.example.android.parsingpractice;

/**
 * Created by Akanksha_Rajwar on 24-08-2018.
 */

public class Earthquake {
    Double magnitude;
    String location;
    String date;

    public Earthquake(Double mag,String loc, String dateRec)
    {
        magnitude=mag;
        location=loc;
        date=dateRec;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
}
