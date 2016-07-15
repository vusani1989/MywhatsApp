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
 * Created by ABVM537 on 7/13/2016.
 */
public class callsAdapter extends ArrayAdapter<classCalls>{
    Context context;
    int resourse;
    ArrayList<classCalls> calls = null;

        public callsAdapter(Context c, int res, ArrayList<classCalls> calls){
            super(c,res,calls);
            this.context = c;
            this.resourse = res;
            this.calls = calls;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        classCalls call = calls.get(position);

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layoutcalls,parent,false);
        }
        TextView callName = (TextView) convertView.findViewById(R.id.memberNameCall);
        ImageView imageCall = (ImageView) convertView.findViewById(R.id.imageViewStatusCall);

        callName.setText(call.nameCall);
        imageCall.setImageResource(call.imagedIdCall);
        return convertView;
    }
}
