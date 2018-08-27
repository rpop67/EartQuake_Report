package com.example.android.parsingpractice;

/**
 * Created by Akanksha_Rajwar on 24-08-2018.
 */

public class Earthquake {
    Double magnitude;
    String location;
    String date;
    String url;

    public Earthquake(Double mag,String loc, String dateRec,String urlRec)
    {
        magnitude=mag;
        location=loc;
        date=dateRec;
        url=urlRec;
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

    public String getUrl(){ return url;}


}
