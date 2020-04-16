package com.twu.biblioteca;

public class Option {

    private String name;

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
            default:
                System.out.println("Please select a valid option");
                return;
        }
    }
}
