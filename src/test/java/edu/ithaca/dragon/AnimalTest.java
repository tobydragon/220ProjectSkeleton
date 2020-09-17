package edu.ithaca.dragon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    
    @Test
    public void toStringTest(){
        Animal animal = new Animal("Sally", 4);
        assertNotNull(animal.toString());
        assertEquals("Sally weighs 4 pounds", animal.toString());
    }

    @Test
    public void sumOfWeightsTest(){
        ArrayList<Animal> animals = new ArrayList<>();
        assertEquals(0, Animal.sumOfWeights(animals));
        animals.add(new Animal("dog", 30));
        assertEquals(30, Animal.sumOfWeights(animals));
        animals.add(new Animal("cat", 8));
        animals.add(new Animal("gerbil", 2));
        animals.add(new Animal("puppy", 5));
        assertEquals(45, Animal.sumOfWeights(animals));

    }
}
