package com.example.android.themusicofyou;

/**
 * Declaration of the Playlist custom class, which represents an album, the album's artist, and the number of songs
 * and also the methods to retrieve them.
 */

public class Playlist {

    //This is the album's title
    private String mPlaylistTitle;

    //This is the album's artist
    private String mNumberOfSongs;

    private String mPlaylistLength;


    //Constructor
    public Playlist(String playlistTitle, String numberOfSongs, String playlistLength) {
        mPlaylistTitle = playlistTitle;
        mNumberOfSongs = numberOfSongs;
        mPlaylistLength = playlistLength;
    }

    //This is the method to get the album's title
    public String getPlaylistTitle() {
        return mPlaylistTitle;
    }

    //This is the method to get the album's artist
    public String getNumberOfSongs() {
        return mNumberOfSongs;
    }

    //This is the method to get the album's number of songs
    public String getPlaylistLength() {
        return mPlaylistLength;
    }
}
