package com.twu.biblioteca;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class MenuTest {
    private ByteArrayOutputStream testOut;
    private Menu menu;
    private Option option1 = new Option("List of books");

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

//    @Before
//    public void setMenu(){
//        menu = new Menu(option1);
//    }

    @Test
    public void menuShowOptions(){
        ArrayList<Option> optionsList = new ArrayList<Option>(Arrays.asList(option1));
        menu = new Menu(optionsList);
        String optionMessage = "Type your selection:\n" + "0: List of books\n";
//        menu.handleSelection();
//        assertEquals(optionMessage, testOut.toString());
    }
}
