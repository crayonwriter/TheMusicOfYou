package com.example.android.themusicofyou;

/**
 * Declaration of the Song custom class, which represents a song, the song's artist, and the song's album
 * and also the methods to retrieve them.
 */

public class Song {

    //This is the title of the song
    private String mSongTitle;

    //This is the song's artist
    private String mSongArtist;

    //This is the song's album
    private String mSongAlbum;

//Constructor
    public Song(String songTitle, String songArtist, String songAlbum) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongAlbum = songAlbum;
    }

    //This is the method to get the song's title
    public String getSongTitle() {
        return mSongTitle;
    }

    //This is the method to get the song's artist
    public String getSongArtist() {
        return mSongArtist;
    }

    //This is the method to get the song's album
    public String getSongAlbum() {
        return mSongAlbum;
    }
}



