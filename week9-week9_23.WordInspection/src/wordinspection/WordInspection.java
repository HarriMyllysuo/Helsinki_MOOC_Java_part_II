/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    
    private File file;
    private Scanner reader;
    private List<String> wordsZ;
    private List<String> wordsL;
    private List<String> allWords;
    private List<String> palindromes;
    private List<String> allVowels;
    
    public WordInspection(File file) throws Exception {
        this.file = file;
        this.reader = new Scanner(file, "UTF-8");
        this.wordsZ = new ArrayList<String>();
        this.allWords = new ArrayList<String>();
        this.wordsL = new ArrayList<String>();
        this.palindromes = new ArrayList<String>();
        this.allVowels = new ArrayList<String>();
        readingFile();
    }
    
    private void readingFile() {
        
        while (reader.hasNextLine()) {
            String read = reader.nextLine();
            this.allWords.add(read);
        }
    }
    
    public int wordCount() {
        int counter = 0;
        
        for (String s : allWords) {
            counter++;
        }
        return counter;
    }
    
    public List<String> wordsContainingZ() {
        
        for (String s : allWords) {
            if (s.contains("z")) {
                this.wordsZ.add(s);
            }
        }
        /* while (reader.hasNextLine()) {
            String read = reader.nextLine();
            if (read.contains("z")) {
                this.wordsZ.add(read);
            }
        } */
        return this.wordsZ;
    }
    
    public List<String> wordsEndingInL() {
        for (String s : allWords) {
            if (s.endsWith("l")) {
                this.wordsL.add(s);
            }
        }
        return this.wordsL;
    }
    
    public List<String> palindromes() {
        for (String s1 : allWords) {
            String s2 = "";
            String character;
            int i = s1.length();
            while (i > 0) {
                character = s1.substring(i-1, i);
                s2 += character;
                i--;
            }
            if (s1.equals(s2)) {
                this.palindromes.add(s2);
            }
        }
        /* StringBuilder sb = new StringBuilder();
        for (String s : allWords) {
            
        } */
        return this.palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        for (String s : allWords) {
            if (s.contains("a") && s.contains("e") && s.contains("i")
                    && s.contains("o") && s.contains("u") && s.contains("y")
                    && s.contains("ä") && s.contains("ö")) {
                this.allVowels.add(s);
            }
        }
        
        return this.allVowels;
    }
}
