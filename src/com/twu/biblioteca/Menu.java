package com.twu.biblioteca;

public class Menu {
    private Option[] optionsList;

    public Menu(Option[] optionsList){
        this.optionsList = optionsList;
    }

    public void showOptions(){
        for (Option option: optionsList){
            System.out.println(option.getName());
        }
    }
}
