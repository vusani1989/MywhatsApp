package com.example.abvm537.mywhatsapp;

import android.app.LauncherActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private static final float BYTES_PER_PX = 4.0f;
//    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //list view
        ListView listViewCharts = (ListView) findViewById(R.id.listViewChart);
        ArrayList<SchoolSuject>sujects = new ArrayList<SchoolSuject>();

        SchoolSuject Vusi = new SchoolSuject("Vusi", R.drawable.ic_message_white_48dp);
        sujects.add(Vusi);

        SchoolSuject bednog = new SchoolSuject("bednog", R.drawable.ic_message_white_48dp);
        sujects.add(bednog);

        SchoolSuject tash = new SchoolSuject("fine", R.drawable.ic_message_white_48dp);
        sujects.add(tash);

        SchoolSuject tau = new SchoolSuject("tau", R.drawable.ic_message_white_48dp);
        sujects.add(tau);

        SchoolSuject mudise = new SchoolSuject("mudise", R.drawable.ic_message_white_48dp);
        sujects.add(mudise);

        SchoolSuject dh = new SchoolSuject("dh", R.drawable.ic_message_white_48dp);
        sujects.add(dh);

        SchoolSuject colins = new SchoolSuject("colins", R.drawable.ic_message_white_48dp);
        sujects.add(colins);

        SchoolSuject lee = new SchoolSuject("god bless", R.drawable.ic_message_white_48dp);
        sujects.add(lee);

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(),R.layout.layoutchart, sujects);

        listViewCharts.setAdapter(adapter);
        //SETTTING ITEM LISTENER ON A LIST VIEW
        listViewCharts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selectet", Toast.LENGTH_LONG)
                        .show();
                Intent intent = new Intent(MainActivity.this, ActivityChart.class);
                startActivity(intent);
            }
        });
        //list view 2 is displaying the calls maid
        ListView listViewCallInfor = (ListView)findViewById(R.id.listViewCalls);
        ArrayList<classCalls>callses = new ArrayList<classCalls>();

        classCalls Vusani = new classCalls("Vusi", R.drawable.ic_message_white_48dp);
        callses.add(Vusani);

        classCalls bednogcALL = new classCalls("bednog", R.drawable.ic_message_white_48dp);
        callses.add(bednogcALL);

        classCalls tashCALL = new classCalls("fine", R.drawable.ic_message_white_48dp);
        callses.add(tashCALL);

        classCalls tauCall = new classCalls("tau", R.drawable.ic_message_white_48dp);
        callses.add(tauCall);

        classCalls mudiseCall = new classCalls("mudise", R.drawable.ic_message_white_48dp);
        callses.add(mudiseCall);

        classCalls dhCall = new classCalls("dh", R.drawable.ic_message_white_48dp);
        callses.add(dhCall);

        classCalls colinsCall = new classCalls("colins", R.drawable.ic_message_white_48dp);
        callses.add(colinsCall);

        classCalls leeCall = new classCalls("lean", R.drawable.ic_message_white_48dp);
        callses.add(leeCall);

        callsAdapter adapter2 = new callsAdapter(getApplicationContext(),R.layout.layoutcalls,callses);

        listViewCallInfor.setAdapter(adapter2);
        listViewCallInfor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selectet", Toast.LENGTH_LONG)
                        .show();
                Intent intent = new Intent(MainActivity.this, ActivityCalls.class);
                startActivity(intent);
            }
        });


        //list to display contacts
        ListView listViewContacts = (ListView) findViewById(R.id.listViewContact);
        ArrayList<classContact> contacts = new ArrayList<classContact>();

        classContact VusaniContact = new classContact("Vusi", R.drawable.ic_message_white_48dp);
        contacts.add(VusaniContact);

        classContact bednogContact = new classContact("bednog", R.drawable.ic_message_white_48dp);
        contacts.add(bednogContact);

        classContact tashContact = new classContact("fine", R.drawable.ic_message_white_48dp);
        contacts.add(tashContact);

        classContact tauContact = new classContact("tau", R.drawable.ic_message_white_48dp);
        contacts.add(tauContact);

        classContact mudiseContact = new classContact("mudise", R.drawable.ic_message_white_48dp);
        contacts.add(mudiseContact);

        classContact dhContact = new classContact("dh", R.drawable.ic_message_white_48dp);
        contacts.add(dhContact);

        classContact colinsContact = new classContact("colins", R.drawable.ic_message_white_48dp);
        contacts.add(colinsContact);

        classContact leeContact = new classContact("lean", R.drawable.ic_message_white_48dp);
        contacts.add(leeContact);
        contactAdapter adapter3 =new contactAdapter(getApplicationContext(),R.layout.layoutcontact,contacts);
        listViewContacts.setAdapter(adapter3);
//setting item click lestener
        listViewContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selectet", Toast.LENGTH_LONG)
                        .show();
                Intent intent = new Intent(MainActivity.this, ActivityChart.class);
                startActivity(intent);
            }
        });
        //MY TABS
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("CALLS");
        tabSpec.setContent(R.id.CALLS);
        tabSpec.setIndicator("CALLS");
        //tabHost.addTab(tabSpec);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("CHATS");//assignig tab buttons
        tabSpec.setContent(R.id.CHATS);
        tabSpec.setIndicator("CHATS");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("CONTACTS");//assignig tab buttons
        tabSpec.setContent(R.id.CONTACTS);
        tabSpec.setIndicator("CONTACTS");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#065E52"));
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#065E52"));
        tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#065E52"));


        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }


}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intentSetting = new Intent(MainActivity.this, ActivitySettings.class);
            startActivity(intentSetting);
            return super.onOptionsItemSelected(item);
        }
        if(id == R.id.action_Status){
            Intent intent = new Intent(MainActivity.this, ActivitySatus.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
