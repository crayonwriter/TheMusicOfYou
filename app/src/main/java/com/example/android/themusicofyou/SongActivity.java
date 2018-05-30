package com.example.android.themusicofyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create arraylist for songs and added some songs.
        final ArrayList<Song> songs = new ArrayList<Song>();
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

        ListView songListView = findViewById(R.id.songList);

        songListView.setAdapter(adapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get songs data from the songList
                Song songPlaying = songs.get(position);
                Intent intent = new Intent(SongActivity.this, NowPlayingActivity.class);
                intent.putExtra("Artist:", songPlaying.getSongArtist());
                intent.putExtra("Title:", songPlaying.getSongTitle());
                intent.putExtra("Album:", songPlaying.getSongAlbum());
                startActivity(intent);
            }
        });
//
    }


}
//    Sending objects between activities – Android putExtra method
//        This is the code that puts SMSData object in an intent using putExtra method and starts a new activity. SMSData object is available for the new SMSActivity activity that was just started.
//
//// Create an intent
//        Intent intent = new Intent(this, ActivityClass.class);
//        intent.putExtra("key", yourObjectInstance);
//
//// Start activity
//        startActivity(intent);