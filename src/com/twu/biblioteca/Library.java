package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;
//    private static ArrayList<Book> booksAvailable;
    private static ArrayList<Book> booksNotAvailable;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static void displayBooks(ArrayList<Book> booksToDisplay){
        if(booksToDisplay.size()>0) {
            for (Book book : booksToDisplay) {
                System.out.println(booksToDisplay.indexOf(book) + ": " + book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear());
            }
        } else {
            System.out.println("No books to show!");
        }
        System.out.println("");
    }

    public static ArrayList<Book> getAvailableBooks(){
        ArrayList<Book> booksAvailable = new ArrayList<Book>();

        for (Book book : books){
            if(book.getIsAvailable()) {
                booksAvailable.add(book);
            }
        }
        return booksAvailable;
    }

    public static ArrayList<Book> getNotAvailableBooks(){
        booksNotAvailable = new ArrayList<Book>();

        for (Book book : books){
            if(!book.getIsAvailable()) {
                booksNotAvailable.add(book);
            }
        }
        return booksNotAvailable;
    }


}
