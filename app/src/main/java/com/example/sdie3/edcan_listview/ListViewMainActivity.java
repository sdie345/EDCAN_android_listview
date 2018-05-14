package com.example.sdie3.edcan_listview;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class ListViewMainActivity extends AppCompatActivity {
    ListView listView;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_main);

        listView = findViewById(R.id.listView);
        adapter = new ListViewAdapter();
        listView.setAdapter(adapter);
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.doc),"의사","누군지 몰라");
    }
}
