package com.example.android.themusicofyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view to connect OnClickListener to the album view
        TextView albumView = findViewById(R.id.albums);

        //Create album intent
        final Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

        //Attach OnClickListener to the album view
        albumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(albumsIntent);
            }

        });


        //Find the view to connect OnClickListener to the playlists view
        TextView playlistsView = findViewById(R.id.playlists);

        //Create playlists intent
        final Intent playlistsIntent = new Intent(MainActivity.this, PlaylistActivity.class);

        //Attach OnClickListener to the playlist view
        playlistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playlistsIntent);
            }

        });

        //Find the view to connect OnClickListener to the songs view
        TextView songsView = findViewById(R.id.songs);

        //Create songs intent
        final Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);

        //Attach OnClickListener to the songs view
        songsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(songsIntent);
            }

        });


    }

}

