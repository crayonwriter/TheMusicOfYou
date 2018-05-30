package com.example.android.themusicofyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        songView.setText(title);
        artistView.setText(artist);
        albumView.setText(album);
        numberOfSongsView.setText(numberOfSongs);

    }


}
