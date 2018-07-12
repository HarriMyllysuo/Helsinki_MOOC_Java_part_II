
import java.util.ArrayList;

public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    
    public Container(int maxWeightLimit) {
        maxWeight = maxWeightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        /* int weight = totalWeight();
        weight += totalWeight();
        if (weight <= maxWeight) {
            suitcases.add(suitcase);
        } */
        if ((suitcase.totalWeight() + this.totalWeight()) <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
    
    public String toString() {
        int weight = totalWeight();
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
}
