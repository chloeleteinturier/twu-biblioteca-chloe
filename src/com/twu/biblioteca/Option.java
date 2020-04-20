package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Option {

    private String name;
//    private int chosenBookIndex;
    private Book bookChosen;
    private Movie movieChosen;

    public Option(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void applyOption(){
        switch (getName()){
            case "List of books":
                Library.displayBooks(Library.getAvailableBooks());
                return;
            case "Quit":
                System.out.println("See you soon :)");
                BibliotecaApp.quitApplication = true;
                return;
            case "Checkout a book":
                ArrayList<Book> booksAvailable = Library.getAvailableBooks();
                String checkoutIndication = "Select the book you want to checkout";
                String checkoutSuccessMessage = "Thank you! Enjoy the book";
                String checkoutErrorMessage = "Sorry, that book is not available";

                handleBookStatus(booksAvailable, checkoutIndication, checkoutSuccessMessage, checkoutErrorMessage);
                return;
            case "Return a book":
                ArrayList<Book> booksNotAvailable = Library.getNotAvailableBooks();
                String returnIndication = "Type the title of the book you want to return";
                String returnSuccessMessage = "Thank you for returning the book";
                String returnErrorMessage = "That is not a valid book to return";

                handleBookStatus(booksNotAvailable, returnIndication, returnSuccessMessage, returnErrorMessage);
                return;
            case "List of movies":
                Library.displayMovies(Library.getAvailableMovies());
                return;
            case "Checkout a movie":
                ArrayList<Movie> moviesAvailable = Library.getAvailableMovies();
                String checkoutMovieIndication = "Select the movie you want to checkout";
                String checkoutMovieSuccessMessage = "Thank you! Enjoy the movie";
                String checkoutMovieErrorMessage = "Sorry, that movie is not available";

                handleMovieStatus(moviesAvailable, checkoutMovieIndication, checkoutMovieSuccessMessage, checkoutMovieErrorMessage);
                return;
            case "Return a movie":
                ArrayList<Movie> moviesNotAvailable = Library.getNotAvailableMovies();
                String returnMovieIndication = "Select the movie you want to return";
                String returnMovieSuccessMessage = "Thank you for returning the movie";
                String returnMovieErrorMessage = "That is not a valid movie to return";

                handleMovieStatus(moviesNotAvailable, returnMovieIndication, returnMovieSuccessMessage, returnMovieErrorMessage);
                return;
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }

    private void handleBookStatus(ArrayList<Book> booksToManage, String indication, String successMessage, String errorMessage){
        Library.displayBooks(booksToManage);

        if (booksToManage.size() > 0) {
            System.out.println(indication);
            Scanner scanner = new Scanner(System.in);
            int chosenBookIndex = scanner.nextInt();
            for (Book book : booksToManage) {
                if (booksToManage.indexOf(book) == chosenBookIndex) {
                    bookChosen = book;
                }
            }
            if (bookChosen != null) {
                bookChosen.toggleIsAvailable();
                System.out.println(successMessage);
                bookChosen = null;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    private void handleMovieStatus(ArrayList<Movie> moviesToManage, String indication, String successMessage, String errorMessage){
        Library.displayMovies(moviesToManage);

        if (moviesToManage.size() > 0) {
            System.out.println(indication);
            Scanner scanner = new Scanner(System.in);
            int chosenMovieIndex = scanner.nextInt();
            for (Movie movie : moviesToManage) {
                if (moviesToManage.indexOf(movie) == chosenMovieIndex) {
                    movieChosen = movie;
                }
            }
            if (movieChosen != null) {
                movieChosen.toggleIsAvailable();
                System.out.println(successMessage);
                movieChosen = null;
            } else {
                System.out.println(errorMessage);
            }
        }
    }
}
