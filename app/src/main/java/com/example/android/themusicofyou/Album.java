package com.example.android.themusicofyou;

/**
 * Declaration of the Album custom class, which represents an album, the album's artist, and the number of songs
 * and also the methods to retrieve them.
 */

public class Album {

    //This is the album's title
    private String mAlbumTitle;

    //This is the album's artist
    private String mAlbumArtist;

    private String mNumberOfSongs;



    //Constructor
    public Album(String AlbumTitle, String AlbumArtist, String NumberOfSongs) {
        mAlbumTitle = AlbumTitle;
        mAlbumArtist = AlbumArtist;
        mNumberOfSongs = NumberOfSongs;
    }

    //This is the method to get the album's title
    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    //This is the method to get the album's artist
    public String getAlbumArtist() {
        return mAlbumArtist;
    }

    //This is the method to get the album's number of songs
    public String getNumberOfSongs() {
        return mNumberOfSongs;
    }
}

