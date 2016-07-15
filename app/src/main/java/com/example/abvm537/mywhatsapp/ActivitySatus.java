package com.example.abvm537.mywhatsapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySatus extends AppCompatActivity {
    ArrayList<String> selectStatus = null;
    ArrayAdapter<String> adapterStatus = null;
    ListView listViewStatus = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_satus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        selectStatus =new ArrayList<>();
        Collections.addAll(selectStatus,"God help me",
                                        "I will be thevfor you",
                                        "Availeble","Urgently",
                                        "Busy","At school","at the movies","Bbattery about to die",
                                        "Cant talk,WhatsApp only","In meeting","At the gym","Sleeping");
        adapterStatus = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,selectStatus);
        listViewStatus = (ListView)findViewById(R.id.listViewSelectStatus);
        listViewStatus.setAdapter(adapterStatus);

        TabHost tabHostStatus = (TabHost)findViewById(R.id.tabHost2);
        tabHostStatus.setup();

        TabHost.TabSpec tabStatus = tabHostStatus.newTabSpec("Select your status");
        tabStatus.setContent(R.id.tabStatusHeader);
        tabStatus.setIndicator("Select your status");
        tabHostStatus.addTab(tabStatus);

        TabHost tabCurrentStatus = (TabHost) findViewById(R.id.tabHost3);
        tabCurrentStatus.setup();

        TabHost.TabSpec tabCurrent = tabCurrentStatus.newTabSpec("Your current status");
        tabCurrent.setContent(R.id.currentStatus);
        tabCurrent.setIndicator("You current status");
        tabCurrentStatus.addTab(tabCurrent);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Delete_All) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
