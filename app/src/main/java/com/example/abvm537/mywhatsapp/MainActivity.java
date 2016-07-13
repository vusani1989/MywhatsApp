package com.example.abvm537.mywhatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

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

//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeResource(getResources(), R.id.imageViewStatus, options);
//        int imageHeight = options.outHeight;
//        int imageWidth = options.outWidth;
//        String imageType = options.outMimeType;


        //list view
        ListView listView = (ListView) findViewById(R.id.listViewChart);
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

//    public void loadImage() {
//        if(readBitmapInfor() > Memory.megabytesFree()) {
//            subSampleImage(32);
//        }else {
//            image.setImageResource(R.drawable.chrysanthemum);
//        }
//    }
//
//    private void subSampleImage(int powerOf2) {
//        if(powerOf2 < 1 || powerOf2 > 32 ){
//            Log.e("Scalebefore","apply upscale of " + powerOf2);
//            return;
//        }
//        final Resources res = this.getResources();
//        final BitmapFactory.Options options = new  BitmapFactory.Options();
//        options.inJustDecodeBounds = false;
//        options.inSampleSi private float readBitmapInfor() {
//        final Resources res = this.getResources();
//        final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeResource(res, R.drawable.chrysanthemum, options);
//        final float imageHeigt = options.outHeight;
//        final float imageWidth = options.outWidth;
//        final String imageMimeType = options.outMimeType;
//
//        Log.d("scaleBeforeLoad","w, h, type:" + imageWidth + "," + imageHeigt + ", " + imageMimeType);
//        Log.d("scaleBeforeLoad","estimated" + imageWidth * imageHeigt * BYTES_PER_PX / Memory.BYTES_IN_MB );
//        return  imageWidth * imageHeigt * BYTES_PER_PX / Memory.BYTES_IN_MB;
//    }ze = powerOf2;
//        final Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.chrysanthemum, options);
//        image.setImageBitmap(bmp);
//    }

//

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

//    public static int calculateInSampleSize(
//            BitmapFactory.Options options, int reqWidth, int reqHeight) {
//        // Raw height and width of image
//        final int height = options.outHeight;
//        final int width = options.outWidth;
//        int inSampleSize = 1;
//
//        if (height > reqHeight || width > reqWidth) {
//
//            final int halfHeight = height / 2;
//            final int halfWidth = width / 2;
//
//            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
//            // height and width larger than the requested height and width.
//            while ((halfHeight / inSampleSize) > reqHeight
//                    && (halfWidth / inSampleSize) > reqWidth) {
//                inSampleSize *= 2;
//            }
//        }
//
//        return inSampleSize;
//    }
//
//    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
//                                                         int reqWidth, int reqHeight) {
//
//        // First decode with inJustDecodeBounds=true to check dimensions
//        final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeResource(res, resId, options);
//
//        // Calculate inSampleSize
//        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
//
//        // Decode bitmap with inSampleSize set
//        options.inJustDecodeBounds = false;
//        return BitmapFactory.decodeResource(res, resId, options);
//    }


//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        String member_name = rowItems.get(position).getMember_name();
//        Toast.makeText(getApplicationContext(),""+ member_name,
//                Toast.LENGTH_LONG).show();
//    }
}
