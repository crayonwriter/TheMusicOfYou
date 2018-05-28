//Make a GridView for the albums, don't forget to make number of columns in the XML
package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.example.android.themusicofyou.R;
import com.example.android.themusicofyou.Song;
import com.example.android.themusicofyou.SongAdapter;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create arraylist for songs and added some songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Despacito", "Luis Fonsi & Daddy Yankee", "Despacito"));
        songs.add(new Song("Bailando", "Enrique Iglesias", "Sex and Love"));
        songs.add(new Song("X", "Nicky Jam", "X"));
        songs.add(new Song("Danza Kuduro", "Lucenzo", "Don Omar Presents: Meet the Orphans"));
        songs.add(new Song("Pose", "Daddy Yankee", "Talento de Barrio"));
        songs.add(new Song("Desnuda", "Ricardo Arjana", "Sin Daños a Terceros"));
        songs.add(new Song("El Problema", "Ricardo Arjana", "Santo Pecado"));
        songs.add(new Song("Tal Vez", "Ricky Martin", "Almas Del Silencio"));
        songs.add(new Song("Taboo", "Don Omar", "Don Omar Presents: Meet the Orphans"));
        songs.add(new Song("Suerte", "Shakira", "Laundry Service"));
        songs.add(new Song("Dimelo", "Enrique Iglesias", " Insomniac"));


        SongAdapter adapter = new SongAdapter(this, songs);

        GridView albumGridView = findViewById(R.id.albumGrid);

        albumGridView.setAdapter(adapter);
    }
}

