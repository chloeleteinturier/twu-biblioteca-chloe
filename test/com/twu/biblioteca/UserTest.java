package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user1;

    @Before
    public void setUpUser() {
        User user1 = new User("123-1234", "123", "Chloé", "chloe.leteinturier@thoughtworks.com", "123456789");
    }

    @Test
    public void testUserHasLibraryNumber() {
        assertEquals("123-1234", user1.getLibraryNumber());
    }

    @Test
    public void testUserHasPassword() {
        assertEquals("123", user1.getPassword());
    }

}
