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

public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //This checks if an existing view is being reused or otherwise inflating the view

        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);

        }

        // Get the {@link Song} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the grid_item.xml layout with the ID albumTitle
        TextView titleTextView = (TextView) gridItemView.findViewById(R.id.albumTitle);
        // Get the version name from the current Album object and
        // set this text on the title TextView
        titleTextView.setText(currentAlbum.getAlbumTitle());

        // Find the TextView in the grid_item.xml layout with the ID albumArtist
        TextView artistTextView = (TextView) gridItemView.findViewById(R.id.albumArtist);
        // Get the artist from the current Album object and
        // set this text on the artist TextView
        artistTextView.setText(currentAlbum.getAlbumArtist());

        // Find the TextView in the grid_item.xml layout with the ID numberOfSongs
        TextView numberTextView = (TextView) gridItemView.findViewById(R.id.numberOfSongs);
        // Get the number of songs from the current Album object and
        // set this text on the number TextView
        numberTextView.setText(currentAlbum.getNumberOfSongs());

//This returns the whole grid item layout
        return gridItemView;
    }

}



