
import java.util.Random;

public class Jump {
    
    private Random rnd;
    private int length;
    
    public Jump() {
        this.rnd = new Random();
    }
    
    public void jump() {
        int i = this.rnd.nextInt(61);
        this.length = i + 60;
    }
    
    public int jumpLength() {
        return this.length;
    }
    
    @Override
    public String toString() {
        return "    length: " + this.length;
    }
}
