package com.newgen.imdb.model;

public class Movie {

    private long id;
    private String name;
    private String genre;
    private int year;

    public Movie(long id, String name, String genre, int year) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
