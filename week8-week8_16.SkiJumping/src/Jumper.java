
import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {
    
    private String name;
    private int points;
    private ArrayList<Integer> lengths;
    
    public Jumper(String name, int points) {
        this.name = name;
        this.points = points;
        this.lengths = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void addPoints(int points) {
        this.points += points;
    }
    
    public void addJumpLengths(int length) {
        this.lengths.add(length);
    }
    
    public String getJumpLengths() {
        String s = "";
        int i = lengths.size() - 1;
        for (int length : lengths) {
            //if () {
            //    s += length + " m, ";
            //}
            s += length + " m";
        }
        return s;
    }
    
    @Override
    public String toString() {
        return this.getName() + " (" + this.getPoints() + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return this.points - jumper.getPoints();
    }
}
