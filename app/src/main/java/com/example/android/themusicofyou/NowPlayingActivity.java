package com.example.android.themusicofyou;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView songView = findViewById(R.id.songNowPlaying);
        TextView artistView = findViewById(R.id.artistNowPlaying);
        TextView albumView = findViewById(R.id.albumNowPlaying);
        TextView numberOfSongsView = findViewById(R.id.numberOfSongsAlbum);

        // Get song data
        Intent intent = getIntent();
        String title = intent.getStringExtra("Title:");
        final String artist = intent.getStringExtra("Artist:");
        String album = intent.getStringExtra("Album:");
        String numberOfSongs = intent.getStringExtra("NumberOfSongs:");


        // Display song data
        //TODO Fix the title if/else issue
        if (title == null) {

        } else {
            songView.setText(new StringBuilder().append("Song Title: ").append(title).toString());
        }

        artistView.setText(new StringBuilder().append("Artist: ").append(artist).toString());
        albumView.setText(new StringBuilder().append("Album: ").append(album).toString());
        if (numberOfSongs == null) {
            return;
        } else {
            numberOfSongsView.setText(new StringBuilder().append("Number of Songs: ").append(numberOfSongs).toString());

        }
    }

}



