package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

    }
}
