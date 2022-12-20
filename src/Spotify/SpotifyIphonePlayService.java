package Spotify;

import java.util.HashMap;
import java.util.Map;
// import spotify.com.play;

public class SpotifyIphonePlayService implements Spotify{

    Map<String, PlayList> playListMap = new HashMap<>();
    PlayList currentPlaylist;
    private Song currentSong;
    Map<String, Song> songMap = currentPlaylist.getSongMap();

    @Override
    public void play(Song song, PlayList playList, User user) {
        /// .....
        this.setCurrentSong(song);
        // this.setCurrentPlayList();
        //... play();
    }

    @Override
    public void pause(Song song, PlayList playList, User user) {

    }

    @Override
    public void nextSong(Song song, PlayList playList, User user) {

    }

    private void setCurrentSong(Song song) {
        this.currentSong = song;
    }


}
