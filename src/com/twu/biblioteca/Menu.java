package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Option> optionsList;

    public Menu(ArrayList<Option> optionsList){
        this.optionsList = optionsList;
    }

    public void showOptions(){
        for (Option option: optionsList){
            System.out.println(option.getName());
        }
    }
}
