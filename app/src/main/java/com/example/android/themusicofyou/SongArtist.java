package com.example.android.themusicofyou;

/**Declaration of the SongArtist custom class, which represents a song and the song's artist,
 * and also the methods to retrieve the song and the song's artist
  */

public class SongArtist {

/**This is the title of the song */
        private String mSongTitle;

/**This is the song's artist */
        private String mSongArtist;


        public SongArtist(String songTitle, String songArtist) {
            mSongTitle = songTitle;
            mSongArtist = songArtist;
        }

        /**This is the method to get the song's title */

    public String getSongTitle() {
        return mSongTitle;
    }

    /**This is the method to get the song's artist */
    public String getSongArtist() {
            return mSongArtist;
    }
}



