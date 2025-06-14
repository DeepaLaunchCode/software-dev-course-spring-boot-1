package com.example.mycollections.models;

public class Music extends LibraryItem {

    private String singer;
    private int tracks;

    public Music(String name, String singer, int year, double length) {
        super(name, year);
        this.singer = singer;
        this.tracks = tracks;

    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getLength() {
        return tracks;
    }

    public void setlength(int tracks) {
        this.tracks = tracks;
    }
    public String toString() {
        return String.format("%s (%d), sing by %s, %d minutes",
                getName(), getYear(), singer, (int) tracks);
    }
}
