
public class MilitaryService implements NationalService {
    
    private int daysLeft;
    
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    public void work() {
        this.daysLeft -= 1;
        if (this.daysLeft < 0) {
            this.daysLeft = 0;
        }
    }
    
    public int getDaysLeft() {
        return this.daysLeft;
    }
}
