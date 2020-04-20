package com.twu.biblioteca;

public class Movie extends Media {
    private String name;
    private int year;
    private String director;
    private double rating;

    public Movie(String name,int year, String director, double rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
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

    @Override
    public String getInfo(){
        String information = getName() + " | " + getYear() + " | " + getDirector() + " | " + getRating();
        return information;
    }

}
