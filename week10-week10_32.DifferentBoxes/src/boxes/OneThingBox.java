/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

public class OneThingBox extends Box {
    
    //private List<Thing> oneThing;
    private Thing oneThing;
    
    public OneThingBox() {
        //this.oneThing = new ArrayList<Thing>(1);
        this.oneThing = null;
    }

    @Override
    public void add(Thing thing) {
        if (this.oneThing == null) {
            this.oneThing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.oneThing == null || thing == null) {
            return false;
        }
        return this.oneThing.equals(thing);
    }
    
}
