/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    
    private int maxCapacity;
    private ArrayList<Thing> things;
    
    public Box(int maximumCapacity) {

        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        int helpCapacity = thing.getVolume() + this.getVolume();
        if (helpCapacity <= this.maxCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volumes = 0;
        for (Thing thing : things) {
            volumes += thing.getVolume();
        }
        return volumes;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Thing thing : things) {
            s += thing.getVolume();
        }
        return s;
    }
}
