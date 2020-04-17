package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Book> booksAvailable;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static void displayBooks(){
        getAvailableBooks();
        for (Book book : booksAvailable){
            if(book.getIsAvailable()) {
                System.out.println(booksAvailable.indexOf(book) + ": " + book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear());
            }
        }
        System.out.println("");
    }

    public static void getAvailableBooks(){
        booksAvailable = new ArrayList<Book>();

        for (Book book : books){
            if(book.getIsAvailable()) {
                booksAvailable.add(book);
            }
        }
    }

}
