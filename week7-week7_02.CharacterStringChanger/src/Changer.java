
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> change;

    public Changer() {
        this.change = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.change.add(change);
    }

    public String change(String characterString) {
        String word = characterString;
        for (Change Change : change) {
            word = Change.change(word);
        }
        return word;
    }
}
