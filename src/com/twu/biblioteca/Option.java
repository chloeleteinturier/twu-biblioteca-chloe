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
                System.out.println("Select the book you want to checkout");
                chosenBook = scanner.nextLine().trim();
                return;
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }
}
