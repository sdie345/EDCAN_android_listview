package com.example.sdie3.edcan_listview;

import android.graphics.drawable.Drawable;

/**
 * Created by sdie3 on 2018-05-14.
 */

public class ListViewItem {
    String title;
    String artist;
    Drawable image;

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
