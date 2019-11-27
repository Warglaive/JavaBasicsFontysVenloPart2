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
public class MaxWeightBox extends Box {

    private int MaxWeight;
    private Collection<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.MaxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int currentTotalWeight = 0;
        for (Thing thing1 : things) {
            currentTotalWeight += thing1.getWeight();
        }
        currentTotalWeight += thing.getWeight();
        if (currentTotalWeight <= this.MaxWeight) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.MaxWeight;
        hash = 53 * hash + (this.things != null ? this.things.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaxWeightBox other = (MaxWeightBox) obj;
        if (this.MaxWeight != other.MaxWeight) {
            return false;
        }
        if (this.things != other.things && (this.things == null || !this.things.equals(other.things))) {
            return false;
        }
        return true;
    }
}
