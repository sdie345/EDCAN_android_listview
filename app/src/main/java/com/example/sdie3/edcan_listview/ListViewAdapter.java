package com.example.sdie3.edcan_listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import java.util.ArrayList;

/**
 * Created by sdie3 on 2018-05-14.
 */

public class ListViewAdapter extends BaseAdapter {
    ArrayList<ListViewItem> data = new ArrayList<>();

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context1 = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context1.getSystemService(context1.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.items, parent, false);
        }
        ImageView imgV = convertView.findViewById(R.id.picutre);
        TextView titV = convertView.findViewById(R.id.title);
        TextView artV = convertView.findViewById(R.id.artist);

        ListViewItem listViewItem = data.get(position);
        imgV.setImageDrawable(listViewItem.getImage());
        titV.setText(listViewItem.getTitle());
        artV.setText(listViewItem.getArtist());

        return convertView;
    }

    public void addItem(Drawable image, String title, String artist) {
        ListViewItem new_item = new ListViewItem();
        new_item.setArtist(artist);
        new_item.setImage(image);
        new_item.setTitle(title);
        data.add(new_item);
    }
}
