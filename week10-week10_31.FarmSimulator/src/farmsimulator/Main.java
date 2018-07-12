package farmsimulator;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Test your program here

        // 31.1
        /*BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);
        
        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);*/
        
        // 31.2
        /*Cow cow = new Cow();
        System.out.println(cow);
        
        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        
        System.out.println(cow);
        
        Milkable milkingCow = cow;
        milkingCow.milk();
        System.out.println(cow);
        
        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow); */
        
        // 31.4 Barn
        /*Barn barn = new Barn(new BulkTank());
        System.out.println("Barn: " + barn);

        MilkingRobot robot = new MilkingRobot();
        barn.installMilkingRobot(robot);

        Cow ammu = new Cow();
        ammu.liveHour();
        ammu.liveHour();

        barn.takeCareOf(ammu);
        System.out.println("Barn: " + barn);
        
        LinkedList<Cow> cowList = new LinkedList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());
        
        for (Cow cow : cowList) {
            cow.liveHour();
            cow.liveHour();
        }
        
        barn.takeCareOf(cowList);
        System.out.println("Barn: " + barn); */
        
        // 31.5 Farm
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);
        
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        
        farm.liveHour();
        farm.liveHour();
        
        farm.manageCows();
        
        System.out.println(farm);
        //System.out.println(farm.getOwner() + " is a tough guy!");
    }
}
