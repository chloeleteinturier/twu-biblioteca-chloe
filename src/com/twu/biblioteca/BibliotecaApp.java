package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {

    private static Book book1 = new Book("Martin Eden", "Jack London", 1909);
    private static Book book2 = new Book("The Stanger", "Albert Camus", 1942);
    private static Book book3 = new Book("1984", "George Orwell", 1949);
    private static ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
    private static Library library = new Library(books);

    private static Option option1 = new Option("List of books");
    private static Option[] optionsList = {option1};
    private static Menu menu = new Menu(optionsList);

    public static void main(String[] args) {
        sayWelcome();
        menu.showOptions();
        library.displayBooks();
    }

    public static void sayWelcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

}
