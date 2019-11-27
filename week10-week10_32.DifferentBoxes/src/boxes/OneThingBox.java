/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Warglaive
 */
public class OneThingBox extends Box {

    private Collection<Thing> things;

    public OneThingBox() {
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (this.things.size() < 1) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.things.contains(thing)) {
            return true;
        }
        return false;
    }
}
