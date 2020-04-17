package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
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

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void toggleIsAvailable(){
        isAvailable = !isAvailable;
    }
}
