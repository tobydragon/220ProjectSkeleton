package edu.ithaca.dragon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    
    @Test
    public void toStringTest(){
        Animal animal = new Animal("Sally", 4);
        assertNotNull(animal.toString());
        assertEquals("Sally weighs 4 pounds", animal.toString());
    }
}
