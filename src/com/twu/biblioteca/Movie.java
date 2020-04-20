package com.twu.biblioteca;

public class Movie {
    private String name;
    private int year;
    private String director;
    private double rating;
    private boolean isAvailable;

    public Movie(String name,int year, String director, double rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.isAvailable = true;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }

    public double getRating(){
        return rating;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void toggleIsAvailable(){
        isAvailable = !isAvailable;
    }
}
