/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

    private int boxesVolume;
    private List<Box> listOfBoxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.listOfBoxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(this.boxesVolume);
        for (Thing t : things) {
            if (box.addThing(t) == false) {
                listOfBoxes.add(box);
                box = new Box(boxesVolume);
                box.addThing(t);
            } /* else {
                box.addThing(t);
                listOfBoxes.add(box);
            } */
        }
        listOfBoxes.add(box);
        return this.listOfBoxes;
    }
}
