/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double amount;
    private Random rnd = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"}; // 31 nimeä

    public Cow() {
        int num = new Random().nextInt(31);
        this.name = NAMES[num];
        this.capacity = 15 + rnd.nextInt(26);
        this.amount = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + rnd.nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public double milk() {
        double helpAmount = this.amount;
        this.amount = 0.0;
        return helpAmount;
    }

    @Override
    public void liveHour() {
        this.amount += (7 + rnd.nextInt(14)) / 10.0;
        if (this.amount > this.capacity) {
            this.amount = this.capacity;
        }
    }
}
