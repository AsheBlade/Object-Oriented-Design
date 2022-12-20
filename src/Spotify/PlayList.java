package Spotify;

import java.util.HashMap;
import java.util.Map;

class PlayList {
    private String uuid;
    private String name;
    private Map<String, Song> songMap = new HashMap<>();

    public PlayList(String uuid, String name, Map<String, Song> songMap) {
        this.uuid = uuid;
        this.name = name;
        this.songMap = songMap;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Song> getSongMap() {
        return songMap;
    }

    public void setSongMap(Map<String, Song> songMap) {
        this.songMap = songMap;
    }

    public void addSongToPlayList() {

    }
}