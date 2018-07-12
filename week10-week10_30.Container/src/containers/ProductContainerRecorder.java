/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory ch;
    
    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        super.addToTheContainer(initialVolume);
        this.ch = new ContainerHistory();
        ch.add(initialVolume);
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        ch.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        ch.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }
    
    public String history() {
        return ch.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n" +
                "History: " + this.ch + "\n" +
                "Greatest product amount: " + ch.maxValue() + "\n" +
                "Smallest product amount: " + ch.minValue() + "\n" +
                "Average: " + ch.average() + "\n" +
                "Greatest change: " + ch.greatestFluctuation() + "\n" +
                "Variance: " + ch.variance());
        
    }
    
}
