package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    private Movie movie1;

    @Before
    public void setUpBook() {
        movie1 = new Movie("Call me by your name", 2017, "Luca Guadagnino", 7.9 );
    }

    @Test
    public void testBookHasName() {
        assertEquals("Call me by your name", movie1.getName());
    }

    @Test
    public void testBookHasYear() {
        assertEquals(2017, movie1.getYear());
    }

    @Test
    public void testBookHasDirector() {
        assertEquals("Luca Guadagnino", movie1.getDirector());
    }

    @Test
    public void testBookHasRating() {
        assertEquals(7.9, movie1.getRating(), 0.001);
    }

    @Test
    public void testBookIsAvailable() {
        assertEquals(true, movie1.getIsAvailable());
    }

    @Test
    public void testBookToggleIsAvailable() {
        movie1.toggleIsAvailable();
        assertEquals(false, movie1.getIsAvailable());
        movie1.toggleIsAvailable();
        assertEquals(true, movie1.getIsAvailable());
    }
}