
import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        System.out.println("Statement:\n"
                + "   add - adds a word pair to the dictionary\n"
                + "   translate - asks a word and prints its translation\n"
                + "   quit - quit the text user interface");
        
        while (true) {
            System.out.print("\nStatement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            
            else if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
            }
            
            else if (command.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            }
            
            else {
                System.out.println("Unknown statement");
            }
        }
    }
}
