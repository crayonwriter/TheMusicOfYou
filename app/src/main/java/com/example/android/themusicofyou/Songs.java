package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create arraylist for songs and added some songs.
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Despacito");
        songs.add("Bailando");
        songs.add("X");
        songs.add("Danza Guduro");
        songs.add("Posé");
        songs.add("Desnuda");
        songs.add("El Problema");
        songs.add("Tal Vez");
        songs.add("Taboo");
        songs.add("Suerte");
        songs.add("Dimelo");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, songs);

        ListView songListView = findViewById(R.id.songList);

        songListView.setAdapter(itemsAdapter);
    }
}
