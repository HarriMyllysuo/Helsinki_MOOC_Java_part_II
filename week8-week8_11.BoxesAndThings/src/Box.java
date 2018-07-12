
import java.util.ArrayList;

public class Box implements ToBeStored {
    
    private double maxWeight;
    private ArrayList<ToBeStored> box;
    
    public Box(double weight) {
        this.maxWeight = weight;
        this.box = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored add) {
        
        double helpWeight = add.weight();
        
        if (helpWeight + this.weight() > this.maxWeight) {
            return;
            // this.box.add(add);
        }
        this.box.add(add);
    }
    
    @Override
    public double weight() {
        
        double weight = 0.0;
        
        for (ToBeStored stored : this.box) {
            weight += stored.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.box.size() + " things, total weight " + this.weight()
                + " kg";
    }
    
}
