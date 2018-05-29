package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //Create arraylist for songs and added some songs.
        ArrayList<Playlist> playlist = new ArrayList<Playlist>();
        playlist.add(new Playlist("Spanish Upbeat", "5", "45.00 minutes"));
        playlist.add(new Playlist("Slow Spanish", "10", "120.00 minutes"));


        PlaylistAdapter adapter = new PlaylistAdapter(this, playlist);

        ListView playlistListView = findViewById(R.id.playlistList);

        playlistListView.setAdapter(adapter);
    }
}
