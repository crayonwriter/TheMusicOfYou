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
        setContentView(R.layout.activity_albums);

        //Create arraylist for songs and added some songs.
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Despacito", "Luis Fonsi & Daddy Yankee", "#"));
        albums.add(new Album("Sex and Love", "Enrique Iglesias", "#"));
        albums.add(new Album("X", "Nicky Jam", "#"));
        albums.add(new Album("Don Omar Presents: Meet the Orphans", "Lucenzo", "#"));
        albums.add(new Album("Talento de Barrio", "Daddy Yankee", "#"));
        albums.add(new Album("Sin Daños a Terceros", "Ricardo Arjana", "#"));
        albums.add(new Album("Santo Pecado", "Ricardo Arjana", ""));
        albums.add(new Album("Almas Del Silencio", "Ricky Martin", "#"));
        albums.add(new Album("Laundry Service", "Shakira", "#"));
        albums.add(new Album("Insomniac", "Enrique Iglesias", "#"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        GridView albumGridView = findViewById(R.id.albumGrid);

        albumGridView.setAdapter(adapter);
    }
}

