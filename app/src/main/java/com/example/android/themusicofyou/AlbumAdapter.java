package com.example.android.themusicofyou;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Song> {
    public AlbumAdapter(Activity context, ArrayList<Song> songs) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //This checks if an existing view is being reused or otherwise inflating the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songTitle
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        titleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID songArtist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        // Get the artist from the current Song object and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getSongArtist());

        // Find the TextView in the list_item.xml layout with the ID albumTitle
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albumTitle);
        // Get the album from the current Song object and
        // set this text on the album TextView
        albumTextView.setText(currentSong.getSongAlbum());

//This returns the whole list item layout
        return listItemView;
    }

}



