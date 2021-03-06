package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {
    private static  Library library;
    private static Menu menu;
    private static UserDataBase userDataBase;

    public static boolean quitApplication = false;
    public static User currentUser = null;

    public static void main(String[] args) {
        setUpBiblioteca();
        sayWelcome();
        while (!quitApplication) {
            menu.handleSelection();
            menu.applySelection();
        }
    }

    public static void sayWelcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    private static void setUpBiblioteca(){
        initializeLibrary();
        initializeMenu();
        initializeUserDataBase();
    }

    private static void initializeLibrary(){
        Book book1 = new Book("Martin Eden", "Jack London", 1909);
        Book book2 = new Book("The Stanger", "Albert Camus", 1942);
        Book book3 = new Book("1984", "George Orwell", 1949);
        ArrayList<Media> books = new ArrayList<Media>(Arrays.asList(book1, book2, book3));

        Movie movie1 = new Movie("Call me by your name", 2017, "Luca Guadagnino", 7.9 );
        Movie movie2 = new Movie("Titanic", 1997, "James Cameron", 7.8 );
        Movie movie3 = new Movie("The sixth sense", 1999, "Night Shyamalan", 8.1 );

        ArrayList<Media> movies = new ArrayList<Media>(Arrays.asList(movie1, movie2, movie3));

        library = new Library(books, movies);
    }

    private static void initializeMenu(){
        Option optionBookList = new Option("List of books");
        Option optionCheckout = new Option("Checkout a book");
        Option optionReturn = new Option("Return a book");
        Option optionMovieList = new Option("List of movies");
        Option optionCheckoutMovie = new Option("Checkout a movie");
        Option optionReturnMovie = new Option("Return a movie");
        Option optionLogin = new Option("Login");
        Option optionInfo = new Option("See my information");
        Option optionExit = new Option("Quit");

        ArrayList<Option> optionsList = new ArrayList<Option>(Arrays.asList(optionBookList, optionCheckout, optionReturn, optionMovieList, optionCheckoutMovie, optionReturnMovie,optionLogin,optionInfo, optionExit));

        menu = new Menu(optionsList);
    }

    private static void initializeUserDataBase(){
        User user1 = new User("123-1234", "123", "Chloé", "chloe.leteinturier@thoughtworks.com", "123456789");
        User user2 = new User("234-5678", "qwe", "John", "john@gmail.com", "987654321");

        ArrayList<User> usersList = new ArrayList<User>(Arrays.asList(user1, user2));

        userDataBase = new UserDataBase(usersList);
    }

}
