package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void setUpBook() {
        book1 = new Book("Martin Eden", "Jack London", 1909);
    }

    @Test
    public void testBookHasTitle() {
        assertEquals("Martin Eden", book1.getTitle());
    }

    @Test
    public void testBookHasAuthor() {
        assertEquals("Jack London", book1.getAuthor());
    }

    @Test
    public void testBookHasYear() {
        assertEquals(1909, book1.getYear());
    }

}