package com.example.abvm537.mywhatsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitySettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        ListView listViewSeting = (ListView) findViewById(R.id.listViewSetting);
        ArrayList<SettingsClass> setting = new ArrayList<SettingsClass> ();

        SettingsClass mySelf = new SettingsClass("Vusani",R.drawable.ic_phone_black_48dp);
        setting.add(mySelf);

        settngsAdapter adapterSeting = new settngsAdapter(getApplicationContext(),R.layout.layotsettings,setting);
        listViewSeting.setAdapter(adapterSeting);

    }

}
