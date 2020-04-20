package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Option {

    private String name;
    private Media mediaChosen;

    public Option(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void applyOption(){
        switch (getName()){
            case "List of books":
                ArrayList<Media> booksToDisplay = Library.getAvailableMedias(Library.getBooks());
                Library.displayMedias(booksToDisplay);
                return;
            case "Quit":
                System.out.println("See you soon :)");
                BibliotecaApp.quitApplication = true;
                return;
            case "Checkout a book":
                ArrayList<Media> booksAvailable = Library.getAvailableMedias(Library.getBooks());
                String checkoutIndication = "Select the book you want to checkout";
                String checkoutSuccessMessage = "Thank you! Enjoy the book";
                String checkoutErrorMessage = "Sorry, that book is not available";

                if (BibliotecaApp.currentUser == null){
                    login();
                } else {
                    handleMediaStatus(booksAvailable, checkoutIndication, checkoutSuccessMessage, checkoutErrorMessage);
                }
                return;
            case "Return a book":
                ArrayList<Media> booksNotAvailable = Library.getNotAvailableMedias(Library.getBooks());
                String returnIndication = "Type the title of the book you want to return";
                String returnSuccessMessage = "Thank you for returning the book";
                String returnErrorMessage = "That is not a valid book to return";

                if (BibliotecaApp.currentUser == null){
                    login();
                } else {
                    handleMediaStatus(booksNotAvailable, returnIndication, returnSuccessMessage, returnErrorMessage);
                }
                return;
            case "List of movies":
                ArrayList<Media> moviesToDisplay = Library.getAvailableMedias(Library.getMovies());
                Library.displayMedias(moviesToDisplay);
                return;
            case "Checkout a movie":
                ArrayList<Media> moviesAvailable = Library.getAvailableMedias(Library.getMovies());
                String checkoutMovieIndication = "Select the movie you want to checkout";
                String checkoutMovieSuccessMessage = "Thank you! Enjoy the movie";
                String checkoutMovieErrorMessage = "Sorry, that movie is not available";

                if (BibliotecaApp.currentUser == null){
                    login();
                } else {
                    handleMediaStatus(moviesAvailable, checkoutMovieIndication, checkoutMovieSuccessMessage, checkoutMovieErrorMessage);
                }

                return;
            case "Return a movie":
                ArrayList<Media> moviesNotAvailable = Library.getNotAvailableMedias(Library.getMovies());
                String returnMovieIndication = "Select the movie you want to return";
                String returnMovieSuccessMessage = "Thank you for returning the movie";
                String returnMovieErrorMessage = "That is not a valid movie to return";

                if (BibliotecaApp.currentUser == null){
                    login();
                } else {
                    handleMediaStatus(moviesNotAvailable, returnMovieIndication, returnMovieSuccessMessage, returnMovieErrorMessage);
                }
                return;
            case "Login":
                login();
                return;
            case "See my information":
                User currentUser = BibliotecaApp.currentUser;
                if (BibliotecaApp.currentUser == null){
                    login();
                } else {
                    currentUser.printInfo();
                }
                return;
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }

    private void handleMediaStatus(ArrayList<Media> mediasToManage, String indication, String successMessage, String errorMessage){
        Library.displayMedias(mediasToManage);

        if (mediasToManage.size() > 0) {
            System.out.println(indication);
            Scanner scanner = new Scanner(System.in);
            int chosenMediaIndex = scanner.nextInt();
            mediaChosen = mediasToManage.get(chosenMediaIndex);
            if (mediaChosen != null) {
                mediaChosen.toggleIsAvailable();
                if (!mediaChosen.getIsAvailable()){
                    mediaChosen.setBorrower(BibliotecaApp.currentUser);
                } else {
                    mediaChosen.setBorrower(null);
                }
                System.out.println(successMessage);
                mediaChosen = null;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    private void login(){
        System.out.println("Please, type your library number:");
        Scanner scanner = new Scanner(System.in);
        String libraryNumber = scanner.next();
        UserDataBase.loginUser(libraryNumber);
    }
}
