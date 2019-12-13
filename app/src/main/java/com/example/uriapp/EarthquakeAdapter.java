package com.example.uriapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter (Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }


        //find the aurthquake at the given position in the list of earthquakes
        Earthquake currentActivity = getItem(position);
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentActivity.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById (R.id.location);
        locationView.setText(currentActivity.getLocation());

        TextView dateView = (TextView) listItemView.findViewById (R.id.date);
        dateView.setText(currentActivity.getDate());

        return listItemView;
    }

}
