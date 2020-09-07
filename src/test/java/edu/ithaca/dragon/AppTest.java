package edu.ithaca.dragon;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void countLettersTest(){
        assertEquals(3, App.countLetters("abc"));
        assertEquals(3, App.countLetters("!abc!"));
        assertEquals(2, App.countLetters(" d "));
    }
}
