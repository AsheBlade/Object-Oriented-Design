package Spotify;

import java.util.HashMap;
import java.util.Map;

class User {
    private String uuid;
    private String userName;
    private Map<String, PlayList> playListMap = new HashMap<>();

    public User(String uuid, String userName, Map<String, PlayList> playListMap) {
        this.uuid = uuid;
        this.userName = userName;
        this.playListMap = playListMap;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }
}
