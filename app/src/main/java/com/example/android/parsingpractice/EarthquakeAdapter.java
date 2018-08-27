package com.example.android.parsingpractice;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;

import java.util.ArrayList;

/**
 * Created by Akanksha_Rajwar on 24-08-2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakeCards){
        super(context,0,earthquakeCards);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_info, parent, false);
        }
        Earthquake currentData = getItem(position);

        //Declare elements and set data
        TextView magnitudeTV=listItemView.findViewById(R.id.textMagnitude);
        magnitudeTV.setText(currentData.getMagnitude().toString());

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTV.getBackground();
        int backgroundColor=getMagnitudeColor(currentData.getMagnitude());
        magnitudeCircle.setColor(backgroundColor);



        TextView locationTV=listItemView.findViewById(R.id.textLocation);
        String loc=currentData.getLocation();
        String seperator="of";
        String StoreSplit[]= new String[2];
                //=loc.split(seperator);

        int index=loc.indexOf("of");
        if(index>0)
        {
            StoreSplit[0]=loc.substring(0,index+2);
            StoreSplit[1]=loc.substring(index+3);
        }
        else
        {
            StoreSplit[0]="Near by";
            StoreSplit[1]=loc;
        }

        locationTV.setText(StoreSplit[0]+ " "+StoreSplit[1]);



        TextView dateTV=listItemView.findViewById(R.id.textDate);
        dateTV.setText(currentData.getDate());




        //reached end
        return listItemView;
    }

    public int getMagnitudeColor(double mag)
    {
        int magnitudeFloor=(int)Math.floor(mag);
        int magColorResId;
        switch(magnitudeFloor)
        {
            case 0:
            case 1: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude1);
                    break;
            case 2: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude2);
                    break;
            case 3: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude3);
                    break;
            case 4: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude4);
                    break;
            case 5: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude5);
                    break;
            case 6: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude6);
                    break;
            case 7: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude7);
                    break;
            case 8: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude8);
                    break;
            case 9: magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude9);
                    break;
            default:magColorResId=ContextCompat.getColor(getContext(), R.color.magnitude10plus);
                    break;
        }
        return magColorResId;
    }
}
