package com.example.abvm537.mywhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ABVM537 on 7/15/2016.
 */
public class settngsAdapter extends ArrayAdapter<SettingsClass> {
    Context context;
    int resource;
    ArrayList<SettingsClass> setting = null;

    public settngsAdapter(Context context, int resource, ArrayList<SettingsClass> setting) {
        super(context, resource,setting);
        this.context = context;
        this.resource = resource;
        this.setting = setting;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SettingsClass settingsClass = setting.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layotsettings,parent,false);
        }
        TextView textViewSetingName = (TextView) convertView.findViewById(R.id.settingsName);
        ImageView imageViewSeting = (ImageView) convertView.findViewById(R.id.imageViewSettings);

        textViewSetingName.setText(settingsClass.nameSettings);
        imageViewSeting.setImageResource(settingsClass.imageSettings);
        return convertView;
    }
}
