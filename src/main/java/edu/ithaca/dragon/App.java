package edu.ithaca.dragon;

public class App {

    public static int countLetters(String anyString){
        int total=0;
        for (int i=0; i<anyString.length(); i++){
            char character = anyString.charAt(i);
            int asciiCode = (int) character; //to remember ascii code, see http://cs.smu.ca/~porter/csc/ref/ascii.html
            if (asciiCode >= 97 && asciiCode < 122){
                total++;
            }
        }
        return total;
    }

    public static void main( String[] args ) throws Exception {
        System.out.println( "hello world!");
        int letterTotal = countLetters("a b c!");
        System.out.println("There are " + letterTotal + " letters.");

        Animal animal = new Animal("Sally", 4);
        System.out.println(animal);
    }
}
