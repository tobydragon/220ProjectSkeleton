package edu.ithaca.dragon;

public class Animal {
    private String name;
    private int weightValue;
    private String weightUnits;
    
    public Animal(String name, int weightValue){
        this.name = name;
        this.weightValue = weightValue;
        this.weightUnits = "pounds";
    }

    @Override
    public String toString(){
        String response = name + " weighs " + weightValue + " " + weightUnits;
        return  response;
    }
}
