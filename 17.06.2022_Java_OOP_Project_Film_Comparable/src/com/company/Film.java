package com.company;

public class Film  {
    private String name;
    private String genre;
    private int year;
    private double rating;

    public Film(String name, String genre, int year, int rating) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
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

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film: " +"name: "+ name +", genre: " + genre +", year: " + year + ", rating: " + rating + System.lineSeparator();
    }


}
