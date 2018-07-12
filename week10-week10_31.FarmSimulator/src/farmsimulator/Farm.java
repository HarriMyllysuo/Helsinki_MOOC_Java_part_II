/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
    
    private String name;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String name, Barn barn) {
        this.name = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cows);
    }
    
    public String getOwner() {
        return this.name;
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        s += "Farm owner: " + this.name + "\n" +
                "Barn bulk tank: " + this.barn;
        if (this.cows.isEmpty()) {
            s += "\nNo cows.";
        } else {
            s += "\nAnimals:\n";
            for (Cow cow : cows) {
                s += "        " + cow.toString() + "\n";
            }
        }
        return s;
        //return "Farm owner: " + this.name;
    }
    
}
