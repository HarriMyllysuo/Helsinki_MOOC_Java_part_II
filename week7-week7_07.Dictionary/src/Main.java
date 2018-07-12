import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
        
        /* Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        // System.out.println(dictionary.amountOfWords());
        
        dictionary.add("cembalo", "harpsichord");
        // System.out.println(dictionary.amountOfWords());
        
        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("porkkana"));
        
        ArrayList<String> translations = dictionary.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        } */
    }
}
