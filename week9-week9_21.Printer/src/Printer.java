
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Printer {
    
    private File file;
    private Scanner reader;
    
    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        //File f = new File(this.fileName);
        this.reader = new Scanner(file);
        
        while (reader.hasNextLine()) {
            String find = reader.nextLine();
            if (find.contains(word)) {
                System.out.println(find);
            }
        }
        reader.close();
    }
}
