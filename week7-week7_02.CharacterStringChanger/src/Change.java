
public class Change {

    private char fromCharacter;
    private char toCharacter;
    //private String characterString;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String replaced = characterString.replace(fromCharacter, toCharacter);
        return replaced;
    }
}
