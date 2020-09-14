package edu.ithaca.dragon;

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
}
