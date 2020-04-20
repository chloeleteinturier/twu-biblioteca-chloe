package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Option {

    private String name;
    private int chosenBookIndex;
    private Book bookChosen;

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
                String checkoutIndication = "Type the title of the book you want to checkout";
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
            chosenBookIndex = scanner.nextInt();
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
}
