package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here
        
        // 23.1: Word Count
        File file = new File("src/shortList.txt");
        // File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection wi = new WordInspection(file);
        // System.out.println("words: " + wi.wordCount());
        
        // 23.2: z
        // System.out.println(wi.wordsContainingZ());
        
        // 23.3: Ending l
        // System.out.println(wi.wordsEndingInL());
        
        // 23.4: Palindromeja
        System.out.println(wi.palindromes());
        
        // 23.5: All Vowels
        System.out.println(wi.wordsWhichContainAllVowels());
    }
}
