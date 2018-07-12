
package application;

import java.util.Random;

public class Thermometer implements Sensor {
    
    private boolean on;
    private Random rnd;
    
    public Thermometer() {
        
        this.on = false;
        this.rnd = new Random();
    }

    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.on;
    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.on = true;
    }

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.on = false;
    }

    @Override
    public int measure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int number = 0;
        if (!this.on) {
            throw new IllegalStateException();
            
        } else {
            number = rnd.nextInt(61) - 30;
            return number;
        }
        
    }
    
}
