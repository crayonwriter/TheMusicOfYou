package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create arraylist for songs and added some songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Despacito", "Luis Fonsi & Daddy Yankee", "test"));
        songs.add(new Song("Bailando", "Enrique Iglesias", "test"));
        songs.add(new Song("X", "Nicky Jam", "test"));
        songs.add(new Song("Danza Guduro", "Lucenzo", "test"));
        songs.add(new Song("Posé", "Daddy Yankee", "test"));
        songs.add(new Song("Desnuda", "Ricardo Arjana", "test"));
        songs.add(new Song("El Problema", "Ricardo Arjana", "test"));
        songs.add(new Song("Tal Vez", "Ricky Martin", "test"));
        songs.add(new Song("Taboo", "Don Omar", "test"));
        songs.add(new Song("Suerte", "Shakira", "test"));
        songs.add(new Song("Dimelo", "Enrique Iglesias", "test"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView songListView = findViewById(R.id.songList);

        songListView.setAdapter(adapter);
    }
}
