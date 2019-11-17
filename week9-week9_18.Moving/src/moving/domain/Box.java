/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Warglaive
 */
public class Box implements Thing {

    private List<Thing> things;
    private int maxCapacity;

    public Box(int maximumCapacity) {
        this.things = new ArrayList<Thing>();
        this.maxCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > this.maxCapacity) {
            return false;
        } else {
            this.things.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : this.things) {
            currentVolume += thing.getVolume();
        }
        return currentVolume;
    }
}
