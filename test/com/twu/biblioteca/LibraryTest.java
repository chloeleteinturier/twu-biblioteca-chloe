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
    private Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1913);
    private ArrayList<Media> books = new ArrayList<Media>(Arrays.asList(book1, book2, book3, book4));

    private Movie movie1 = new Movie("Call me by your name", 2017, "Luca Guadagnino", 7.9 );
    private Movie movie2 = new Movie("Titanic", 1997, "James Cameron", 7.8 );
    private Movie movie3 = new Movie("The sixth sense", 1999, "Night Shyamalan", 8.1 );
    private Movie movie4 = new Movie("Eternal sunshine of the spotless mind", 2004, "Michel Gondry", 8.3 );
    private ArrayList<Media> movies = new ArrayList<Media>(Arrays.asList(movie1, movie2, movie3, movie4));

    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @Before
    public void setUpLibrary(){
        library = new Library(books, movies);
        book4.toggleIsAvailable();
        movie4.toggleIsAvailable();
    }

    @Test
    public void LibraryHasBooks(){
        assertEquals(4, library.getBooks().size());
//        assertThat(library.getBooks(), hasItems(book1, book2, book3));
    }

    @Test
    public void LibraryDisplayBooksAvailable(){
        String booksDetails = "0: Martin Eden | Jack London | 1909\n" +
                "1: The Stanger | Albert Camus | 1942\n" +
                "2: 1984 | George Orwell | 1949\n\n";
        Library.displayMedias(Library.getAvailableMedias(Library.getBooks()));
        assertEquals(booksDetails, testOut.toString());
    }

    @Test
    public void LibraryDisplayBooksNotAvailable(){
        String booksDetails = "0: Pride and Prejudice | Jane Austen | 1913\n\n";
        Library.displayMedias(Library.getNotAvailableMedias(Library.getBooks()));
        assertEquals(booksDetails, testOut.toString());
    }

    @Test
    public void LibraryHasMovies(){
        assertEquals(4, library.getMovies().size());
//        assertThat(library.getMovies(), hasItems(movie1, movie2, movie3));
    }

    @Test
    public  void LibraryHasAvailableMovies(){
        assertEquals(3, Library.getAvailableMedias(Library.getMovies()).size());
    }

    @Test
    public void LibraryDisplayMoviesAvailable(){
        String moviesDetails = "0: Call me by your name | 2017 | Luca Guadagnino | 7.9\n" +
                "1: Titanic | 1997 | James Cameron | 7.8\n" +
                "2: The sixth sense | 1999 | Night Shyamalan | 8.1\n\n";
        library.displayMedias(library.getAvailableMedias(library.getMovies()));
        assertEquals(moviesDetails, testOut.toString());
    }

    @Test
    public void LibraryDisplayMoviesNotAvailable(){
        String moviesDetails = "0: Eternal sunshine of the spotless mind | 2004 | Michel Gondry | 8.3\n\n";
        library.displayMedias(library.getNotAvailableMedias(library.getMovies()));
        assertEquals(moviesDetails, testOut.toString());
    }
}
