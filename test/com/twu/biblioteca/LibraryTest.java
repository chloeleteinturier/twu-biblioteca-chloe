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

public class LibraryTest {

    private Library library;
    private Book book1 = new Book("Martin Eden", "Jack London", 1909);
    private Book book2 = new Book("The Stanger", "Albert Camus", 1942);
    private Book book3 = new Book("1984", "George Orwell", 1949);
    private ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));

    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @Before
    public void setUpLibrary(){
        library = new Library(books);
    }

    @Test
    public void LibraryHasBooks(){
        assertEquals(3, library.getBooks().size());
        assertThat(library.getBooks(), hasItems(book1, book2, book3));
    }

    @Test
    public void LibraryDisplayBooks(){
        String booksDetails = "Martin Eden | Jack London | 1909\n" +
                "The Stanger | Albert Camus | 1942\n" +
                "1984 | George Orwell | 1949\n";
        library.displayBooks();
        assertEquals(booksDetails, testOut.toString());
    }
}
