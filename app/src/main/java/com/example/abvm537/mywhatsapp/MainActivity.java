package com.example.abvm537.mywhatsapp;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       //list view
        ListView listView = (ListView) findViewById(R.id.listViewChart);
        ArrayList<SchoolSuject>sujects = new ArrayList<SchoolSuject>();

        SchoolSuject Vusi = new SchoolSuject("Vusi", R.drawable.desert);
        sujects.add(Vusi);

        SchoolSuject bednog = new SchoolSuject("bednog", R.drawable.chrysanthemum);
        sujects.add(bednog);

        SchoolSuject tash = new SchoolSuject("fine", R.drawable.gellyfish);
        sujects.add(tash);

        SchoolSuject tau = new SchoolSuject("tau", R.drawable.hydrangeas);
        sujects.add(tau);

        SchoolSuject mudise = new SchoolSuject("mudise", R.drawable.koala);
        sujects.add(mudise);

        SchoolSuject dh = new SchoolSuject("dh", R.drawable.lighthouse);
        sujects.add(dh);

        SchoolSuject colins = new SchoolSuject("colins", R.drawable.penguins);
        sujects.add(colins);

        SchoolSuject lee = new SchoolSuject("god bless", R.drawable.tulips);
        sujects.add(lee);

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(),R.layout.layoutchart, sujects);
        listView.setAdapter(adapter);

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
            return true;
        }
        if(id == R.id.action_Status){
            Intent intent = new Intent(MainActivity.this, ActivitySatus.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        String member_name = rowItems.get(position).getMember_name();
//        Toast.makeText(getApplicationContext(),""+ member_name,
//                Toast.LENGTH_LONG).show();
//    }
}
