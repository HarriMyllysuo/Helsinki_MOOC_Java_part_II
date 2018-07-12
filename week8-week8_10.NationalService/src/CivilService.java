
public class CivilService implements NationalService {
    
    private int daysLeft;
    
    public CivilService() {
        this.daysLeft = 362;
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
