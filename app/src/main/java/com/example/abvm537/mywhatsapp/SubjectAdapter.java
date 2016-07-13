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
 * Created by ABVM537 on 6/30/2016.
 */
public class SubjectAdapter extends ArrayAdapter<SchoolSuject>{
    Context context;
    int reasource;
    ArrayList<SchoolSuject> sujects = null;

    public SubjectAdapter(Context context, int resource, ArrayList<SchoolSuject> sujects) {
        super(context, resource,sujects);
        this.sujects = sujects;
        this.context = context;
        this.reasource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SchoolSuject suject = sujects.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layoutchart,parent,false);

        }
        TextView subJectText = (TextView)convertView.findViewById(R.id.memberName);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageViewStatus);

        subJectText.setText(suject.name);
        image.setImageResource(suject.imagedId);
        return convertView;


    }
}


