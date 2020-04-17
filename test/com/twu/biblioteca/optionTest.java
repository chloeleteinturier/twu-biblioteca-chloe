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

public class optionTest {
    private Option option1;
    private Option option2;
    private Option option3;

    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @Before
    public void setUpTheOptions(){
        option1 = new Option("List of books");
        option2 = new Option("Quit");
        option3 = new Option("Checkout a book");
    }

    @Test
    public void testOptionAsName() {
        assertEquals("List of books", option1.getName());
    }

    @Test
    public void testOptionQuitTheApp() {
        option2.applyOption();
        assertThat(BibliotecaApp.quitApplication, is(true));
    }

//    @Test
//    public void testOptionCheckoutBook() {
//        option3.applyOption();
//        assertEquals("Select the book you want to checkout\n", testOut.toString());
//    }

}
