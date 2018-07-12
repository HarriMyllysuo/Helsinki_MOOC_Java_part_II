
public class CalculatorLogic {
    
    private int value;
    
    public CalculatorLogic() {
        this.value = 0;
    }
    
    public void increase(int num1) {
        value += num1;
    }

    public void decrease(int num2) {
        value -= num2;
    }
    
    public void reset() {
        value = 0;
    }
    
    public int getValue() {
        return this.value;
    }
}
