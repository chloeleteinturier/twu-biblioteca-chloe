package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Movie> movies;

    public Library(ArrayList<Book> books, ArrayList<Movie> movies){
        this.books = books;
        this.movies = movies;
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
        ArrayList<Book> booksNotAvailable = new ArrayList<Book>();

        for (Book book : books){
            if(!book.getIsAvailable()) {
                booksNotAvailable.add(book);
            }
        }
        return booksNotAvailable;
    }

    public static ArrayList<Movie> getMovies(){
        return movies;
    }

    public static void displayMovies(ArrayList<Movie> moviesToDisplay){
        if(moviesToDisplay.size()>0) {
            for (Movie movie : moviesToDisplay) {
                System.out.println(moviesToDisplay.indexOf(movie) + ": " + movie.getName() + " | " + movie.getYear() + " | " + movie.getDirector() + " | " + movie.getRating());
            }
        } else {
            System.out.println("No movies to show!");
        }
        System.out.println("");
    }

    public static ArrayList<Movie> getAvailableMovies(){
        ArrayList<Movie> moviesAvailable = new ArrayList<Movie>();

        for (Movie movie : movies){
            if(movie.getIsAvailable()) {
                moviesAvailable.add(movie);
            }
        }
        return moviesAvailable;
    }

    public static ArrayList<Movie> getNotAvailableMovies(){
        ArrayList<Movie> moviesNotAvailable = new ArrayList<Movie>();

        for (Movie movie : movies){
            if(!movie.getIsAvailable()) {
                moviesNotAvailable.add(movie);
            }
        }
        return moviesNotAvailable;
    }


}
