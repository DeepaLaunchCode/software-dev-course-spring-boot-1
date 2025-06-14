package com.example.mycollections.models;

public class Movie extends LibraryItem {

    private String director;
    private double length;

    public Movie(String name, String director, int year, double length) {
        super(name, year);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String toString() {
        return String.format("%s (%d), directed by %s, %d minutes",
                getName(), getYear(), director, (int) length);
    }
}