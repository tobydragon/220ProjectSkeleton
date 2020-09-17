package edu.ithaca.dragon;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void countLettersTest(){
        assertEquals(3, App.countLetters("abc"));
        assertEquals(3, App.countLetters("!abc!"));
<<<<<<< HEAD
        assertEquals(1, App.countLetters(" d "));
    }
    
    @Test
    public void eatTest(){
        Animal eater = new Animal("Maria", 100);
        eater.eat();
        assertEquals(103, eater.getWeight());
=======
        assertEquals(2, App.countLetters(" d "));
        
>>>>>>> master
    }
}
