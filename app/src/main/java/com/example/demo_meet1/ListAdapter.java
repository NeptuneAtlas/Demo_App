package com.example.demo_meet1;

import android.content.Context;
import android.media.metrics.Event;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Events> {

public ListAdapter(Context context, ArrayList<Events> userArrayList){
    super(context,R.layout.list_view, userArrayList);

}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    Events events = getItem(position);

    if(convertView == null){
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
    }

        ImageView imageView = convertView.findViewById(R.id.eventIcon);
        TextView userName= convertView.findViewById(R.id.textView4);
        EditText timeDate = convertView.findViewById(R.id.editTextTime);

        imageView.setImageResource(events.ImageId);
        userName.setText(events.name);
        timeDate.setText(events.date);

        return super.getView(position, convertView, parent);
    }
}
