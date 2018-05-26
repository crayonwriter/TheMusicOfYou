package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create arraylist for songs and added some songs.
        ArrayList<String> songList = new ArrayList<String>();
        songList.add("Despacito");
        songList.add("Bailando");
        songList.add("X");
        songList.add("Danza Guduro");
        songList.add("Posé");
        songList.add("Desnuda");
        songList.add("El Problema");
        songList.add("Tal Vez");
        songList.add("Taboo");
        songList.add("Suerte");
        songList.add("Dimelo");

        //Find the view in the XML that we're going to amend, and assign it to a variable
        LinearLayout rootView = findViewById(R.id.rootView);

        //Attempting loop code
        for (int i=0; i<songList.size(); i++) {
            //Construct a textview (which will be a child)
            TextView songsView = new TextView(this);

            //Set the text to show on the screen in the textview
            songsView.setText(songList.get(i));

            //Add the TextView as a child of the linear layout
            rootView.addView(songsView);
        }

    }
}
