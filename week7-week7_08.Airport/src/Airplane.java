
// import java.util.HashMap;

public class Airplane {
    
    private String id;
    private int capacity;
    // private HashMap<String, Integer> airplane = new HashMap<String, Integer>();
    
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getName() {
        return this.id;
    }
    
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
}
