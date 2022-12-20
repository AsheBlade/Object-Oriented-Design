package Spotify;

import java.util.Date;

public class Song {

    private String uuid; // unique id to extract.
    private String name;
    private String artist;
    private String lyric;
    private Date date;

    public Song(String uuid, String name, String artist, String lyric, Date date) {
        this.uuid = uuid;
        this.name = name;
        this.artist = artist;
        this.lyric = lyric;
        this.date = date;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
