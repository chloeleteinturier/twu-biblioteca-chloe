package com.twu.biblioteca;

import java.util.Scanner;

public class Option {

    private String name;
    private String chosenBook;

    public Option(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void applyOption(){
        switch (getName()){
            case "List of books":
                Library.displayBooks();
                return;
            case "Quit":
                System.out.println("See you soon :)");
                BibliotecaApp.quitApplication = true;
                return;
            case "Checkout a book":
                Scanner scanner = new Scanner(System.in);
                Library.displayBooks();
                System.out.println("Select the title of the book you want to checkout");
//                chosenBook = Integer.parseInt(scanner.nextLine().trim());
                chosenBook = scanner.nextLine().trim();
//                if(chosenBook < Library.getAvailableBooks().size()) {
                for (Book book: Library.getAvailableBooks()){
                    if(book.getTitle().equalsIgnoreCase(chosenBook)) {
                        book.toggleIsAvailable();
                    }
                }
                return;
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }
}
