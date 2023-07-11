package com.example.demo_meet1;

import android.content.Context;
import android.media.metrics.Event;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
Context context;
String[] eName;
String[] eDate;
int[] eImages;
LayoutInflater inflater;
    public ListAdapter(Context ctx, String[] name, String[] date, int[] ImageId){
    this.context = ctx;
    this.eName = name;
    this.eDate = date;
    this.eImages = ImageId;
    inflater = LayoutInflater.from(ctx);


    }
    @Override
    public int getCount() {
        return eName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_view, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView4);
        TextView  edtText = (TextView ) convertView.findViewById(R.id.editTextTime);
        ImageView eventImg = (ImageView) convertView.findViewById(R.id.eventIcon);
        txtView.setText(eName[position]);
        edtText.setText(eDate[position]); //maybe get rid of this
        eventImg.setImageResource(eImages[position]);
        return convertView;
    }
}
