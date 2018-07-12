/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Main {
    
    public static void main(String[] args) {
        
        // 20.1
        /* ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);
        
        System.out.println(ten.measure());
        System.out.println(minusFive.measure());
        
        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn()); */
        
        // 20.2
        Thermometer trm = new Thermometer();
        System.out.println(trm.isOn());
        
        trm.on();
        System.out.println(trm.isOn());
        
        System.out.println(trm.measure());
        
        trm.off();
        System.out.println(trm.measure());
    }
    
}
