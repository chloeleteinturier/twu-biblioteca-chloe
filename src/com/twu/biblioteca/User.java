package com.twu.biblioteca;

public class User {
    private String libraryNumber;
    private String password;
    private boolean isLoggedIn;

    public User(String libraryNumber, String password){
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.isLoggedIn = false;
    }

    public String getLibraryNumber(){
        return libraryNumber;
    }

    public String getPassword(){
        return password;
    }
}
