package com.example.android.themusicofyou;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.themusicofyou.Album;
import com.example.android.themusicofyou.R;

import java.util.ArrayList;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {
    public PlaylistAdapter(Activity context, ArrayList<Playlist> playlists) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, playlists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //This checks if an existing view is being reused or otherwise inflating the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist_item, parent, false);

        }

        // Get the {@link Song} object located at this position in the list
        Playlist currentPlaylist = getItem(position);

        // Find the TextView in the grid_item.xml layout with the ID albumTitle
        TextView playlistTextView = (TextView) listItemView.findViewById(R.id.playlistName);
        // Get the version name from the current Album object and
        // set this text on the title TextView
        playlistTextView.setText(currentPlaylist.getPlaylistTitle());

        // Find the TextView in the grid_item.xml layout with the ID albumArtist
        TextView numberOfSongsTextView = (TextView) listItemView.findViewById(R.id.numberOfSongs);
        // Get the artist from the current Album object and
        // set this text on the artist TextView
        numberOfSongsTextView.setText(currentPlaylist.getNumberOfSongs());

        // Find the TextView in the grid_item.xml layout with the ID numberOfSongs
        TextView playlistLength = (TextView) listItemView.findViewById(R.id.playlistLength);
        // Get the number of songs from the current Album object and
        // set this text on the number TextView
        playlistLength.setText(currentPlaylist.getPlaylistLength());

//This returns the whole grid item layout
        return listItemView;
    }

}
