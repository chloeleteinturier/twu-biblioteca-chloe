package com.twu.biblioteca;

public class User {
    private String libraryNumber;
    private String password;
    private boolean isLoggedIn;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String libraryNumber, String password, String name, String email, String phoneNumber){
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isLoggedIn = false;
    }

    public String getLibraryNumber(){
        return libraryNumber;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void printInfo(){
        System.out.println("Name: " + getName() + "\n" + "Email: " + getEmail() + "\n" + "Phone number: " + getPhoneNumber());
    }
}
