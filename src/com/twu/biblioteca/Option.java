package com.twu.biblioteca;

import java.util.Scanner;

public class Option {

    private String name;
    private String chosenBookTitle;
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
                Scanner scanner = new Scanner(System.in);
                Library.displayBooks(Library.getAvailableBooks());
                System.out.println("Type the title of the book you want to checkout");
                chosenBookTitle = scanner.nextLine().trim();
                for (Book book: Library.getAvailableBooks()){
                    if(book.getTitle().equalsIgnoreCase(chosenBookTitle)) {
                        bookChosen = book;
                    }
                }
                if(bookChosen != null){
                    bookChosen.toggleIsAvailable();
                    System.out.println("Thank you! Enjoy the book");
                    bookChosen = null;
                } else {
                    System.out.println("Sorry, that book is not available");
                }
                return;
            case "Return a book":
                Scanner scannerReturn = new Scanner(System.in);
                Library.displayBooks(Library.getNotAvailableBooks());
                System.out.println("Type the title of the book you want to return");
                chosenBookTitle = scannerReturn.nextLine().trim();
                for (Book book: Library.getNotAvailableBooks()){
                    if(book.getTitle().equalsIgnoreCase(chosenBookTitle)) {
                        bookChosen = book;
                    }
                }
                if(bookChosen != null){
                    bookChosen.toggleIsAvailable();
                    System.out.println("Thank you for returning the book");
                    bookChosen = null;
                } else {
                    System.out.println("That is not a valid book to return");
                }
                return;
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }
}
