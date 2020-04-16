package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Option> optionsList;
    private String selectedOption;
    private Option optionToApply;

    public Menu(ArrayList<Option> optionsList){
        this.optionsList = optionsList;
    }

    private void showOptions(){
        System.out.println("Type your selection:");

        for (Option option: optionsList){
            System.out.println(optionsList.indexOf(option) + ": " + option.getName());
        }
    }

    public void handleSelection(){
        showOptions();
        Scanner scanner = new Scanner(System.in);
        selectedOption = scanner.nextLine().trim();
    }

    public void applySelection(){
        for (Option option: optionsList){
            if(option.getName().equalsIgnoreCase(selectedOption) || optionsList.indexOf(option) == Integer.parseInt(selectedOption)){
                optionToApply = option;
            }
        }
        if(optionToApply != null){
            optionToApply.applyOption();
            optionToApply = null;
        } else {
            System.out.println("Please select a valid option");
        }
    }

}
