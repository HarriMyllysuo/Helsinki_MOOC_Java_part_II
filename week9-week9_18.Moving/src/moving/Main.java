package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
        // test your program here

        // Exercise 18.1: Things and Items
        /*Thing item = new Item("toothbrash", 2);
        System.out.println(item); */
        // Exercise 18.2: Comparable Item
        /*List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));
        
        Collections.sort(items);
        System.out.println(items); */
        // Exercise 18.3: Moving Box
        /* Box box = new Box(10);
        box.addThing(new Item("polkupyora", 10));
        box.getVolume();
        System.out.println(box); */

        // Exercise 18.4: Packing Items
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));
        
        Packer packer = new Packer(10);
        
        List<Box> boxes = packer.packThings(things);
        
        System.out.println("number of boxes: " + boxes.size());
        
        for (Box box : boxes) {
            System.out.println("  things in the box: " + box.getVolume() + " dm^3");
        }
    }
}
