package com.twu.biblioteca;

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

    @Before
    public void setUpTheOptions(){
        option1 = new Option("List of books");
        option2 = new Option("Quit");
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
    
}
