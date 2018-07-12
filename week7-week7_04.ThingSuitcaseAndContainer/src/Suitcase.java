
import java.util.ArrayList;

public class Suitcase {

    private int maxWeightLimit;
    // private int weightTotal = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing) {
        int helpWeight = totalWeight();
        helpWeight += thing.getWeight();
        if (helpWeight <= this.maxWeightLimit) {
            this.things.add(thing);
            // this.weightTotal += thing.getWeight();
        }
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing() {
        Thing heaviest;
        if (things.isEmpty()) {
            return null;
        }
        heaviest = things.get(0);
        for (Thing thing : things) {
            if (heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        int weight = totalWeight();
        if (things.isEmpty()) {
            return "empty (" + weight + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + weight + " kg)";
        } else {
            return things.size() + " things (" + weight + " kg)";
        }
    }
}
