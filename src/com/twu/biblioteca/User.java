package com.twu.biblioteca;

public class User {
    private String libraryUser;
    private String password;

    public User(String libraryUser, String password){
        this.libraryUser = libraryUser;
        this.password = password;
    }

    public String getLibraryUser(){
        return libraryUser;
    }

    public String getPassword(){
        return password;
    }
}
