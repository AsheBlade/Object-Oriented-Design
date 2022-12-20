package Spotify;

import java.util.List;
import java.util.Map;

public class PlayListService implements playListInterface{
    Map<String, PlayList> playListMap = this.getPlayListMap();

    private Map<String,PlayList> getPlayListMap() {

        return null;
    }

//    createPlayList(String playListName, List<String> songIds) {}
//    deletePlayList(String playListId){}

    public void addSongToList(List<Song> songList, PlayList playList){
        playList.addSongToPlayList();
    }
//    removeSongFromList(){}
//    changePlayListName(){}
//    searchSongFromList(String songName, String playListId){
//        return Song;
//    }
}