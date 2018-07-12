
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JudgePoints {
    
    private Random rnd;
    private ArrayList<Integer> points;
    
    public JudgePoints() {
        this.rnd = new Random();
        this.points = new ArrayList<Integer>();
    }
    
    public void judgePoints() {
        for (int i = 0; i < 5; i++) {
            int score = this.rnd.nextInt(11) + 10;
            this.points.add(score);
        }
    }
    
    public void sortPoints() {
        Collections.sort(points);
    }
    
    public int addPoints() {
        sortPoints();
        int p = 0;
        for (int i = 1; i < 4; i++) {
            p += this.points.get(i);
        }
        return p;
    }
    
    @Override
    public String toString() {
        return "    judge votes: " + this.points;
    }
}
