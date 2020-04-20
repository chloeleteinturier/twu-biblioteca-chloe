package com.twu.biblioteca;

public class Media {
    private boolean isAvailable;
    private User borrower;

    public Media(){
        this.isAvailable = true;
        this.borrower = null;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void toggleIsAvailable(){
        isAvailable = !isAvailable;
    }

    public void setBorrower(User newBorrower){
        borrower = newBorrower;
    }

    public String getInfo(){
        return "";
    }
}
