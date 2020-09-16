package edu.ithaca.dragon;

import java.util.ArrayList;

public class Animal {
    String name;
    int weightValue;
    String weightUnits;
    
    public Animal(String name, int weightValue){
        this.name = name;
        this.weightValue = weightValue;
        this.weightUnits = "pounds";
    }

    @Override
    public String toString(){
        return name + " weighs " + weightValue + " " + weightUnits; 
    }

    public void eat(){
        weightValue +=3;
    }

    public int getWeight(){
        return weightValue;
    }

    public static int sumOfWeights(ArrayList<Animal> animals){
        int sum = 0;
        for (Animal theAnimal : animals){
            sum += theAnimal.getWeight();
        }
        //either for loop is fine in this scenario
        // for (int i=0; i<animals.size(); i++){
        //     sum += animals.get(i).getWeight();
        // }
        return sum;
    }
}
