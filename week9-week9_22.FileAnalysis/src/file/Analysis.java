/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    //private Scanner reader;
    
    public Analysis(File file) throws Exception {
        this.file = file;
    }
    
    public int lines() throws Exception {
        
        Scanner reader = new Scanner(file);
        int lines = 0;
        
        while (reader.hasNextLine()) {
            String read = reader.nextLine();
            lines ++;
        }
        reader.close();
        return lines;
    }
    
    public int characters() throws Exception {
        
        Scanner reader2 = new Scanner(file);
        int characters = lines();
        
        while (reader2.hasNext()) {
            String read = reader2.useDelimiter("").nextLine();
            characters += read.length();
            // reader2.nextLine();
        }
        
        return characters;
    }
}
