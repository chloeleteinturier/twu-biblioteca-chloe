package com.twu.biblioteca;

public class Option {

    private static String name;

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
            default:
                System.out.println("Please select a valid option");
        }
    }
}
