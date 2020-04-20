package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDataBase {
    private static ArrayList<User> users;
    private static User currentUser = null;

    public UserDataBase(ArrayList<User> users){
        this.users = users;
    }

    public static void loginUser(String libraryNumber){

        for (User user: users) {
            if (user.getLibraryNumber().equals(libraryNumber)) {
                System.out.println("Please, type your password:");
                Scanner scanner = new Scanner(System.in);
                String passwordToVerify = scanner.next();
                if (user.getPassword().equals(passwordToVerify)){
                    currentUser = user;
                }
            }
        }

        if (currentUser == null){
            System.out.println("Sorry, impossible to connect you");
        } else {
            BibliotecaApp.currentUser = currentUser;
            System.out.println("Hello " + currentUser.getName() + ", you are logged in!");
        }
    }
}
