package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void displayBooks(){
        for (Book book : books){

            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear());
        }
    }
}