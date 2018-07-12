import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    
    public String translate(String word) {
        String translation;
        if (dictionary.containsKey(word)) {
            translation = dictionary.get(word);
            return translation;
        }
        return null;
    }
    
    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            translationList.add(key + " = " + dictionary.get(key));
        }
        return translationList;
    }
}
