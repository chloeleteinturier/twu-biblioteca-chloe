package com.twu.biblioteca;

public class Book extends Media {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String getInfo(){
        String information = getTitle() + " | " + getAuthor() + " | " + getYear();
        return information;
    }

}
