/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

public class MilkingRobot {

    private BulkTank bulkTank;

    public MilkingRobot() {

    }

    public BulkTank getBulkTank() {
        if (this.bulkTank == null) {
            return null;
        } else {
            return this.bulkTank;
        }
    }

    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            // this.bulkTank.addToTank(milkable.milk());
            double milk = milkable.milk();
            this.bulkTank.addToTank(milk);
        }
    }
}
