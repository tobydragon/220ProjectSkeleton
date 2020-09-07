package edu.ithaca.dragon;

import java.util.List;
import java.util.Random;

import bridges.connect.Bridges;
import bridges.connect.DataSource;
import bridges.data_src_dependent.GutenbergBook;

public class App {

    public static void bridgesTest() throws Exception{
        //To get your own userId and apiKey, sign up at this website: http://bridges-cs.herokuapp.com/login 
        Bridges bridges = new Bridges(1, "<YOUR_USER_ID_HERE>", "<YOUR_API_KEY_HERE>");
        DataSource ds = bridges.getDataSource();
        List<GutenbergBook> mylist = ds.getGutenbergBookMetaData();
        // Books are just one example of available data. To learn more about data sources, read here: 
        // https://bridgesuncc.github.io/datasets.html
        
        for (int i=0; i<25; i++){
            int randomIndex = new Random().nextInt(mylist.size());
            GutenbergBook randomBook = mylist.get(randomIndex);
            System.out.println(randomBook.getTitle() + ", by " + randomBook.getAuthorName());
        }
    }

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
        
        // bridgesTest();

        Animal animal = new Animal("Sally", 4);
        System.out.println(animal);
    }
}
