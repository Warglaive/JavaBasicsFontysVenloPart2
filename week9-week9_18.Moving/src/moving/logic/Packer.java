/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Warglaive
 */
public class Packer {

    private int BoxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.BoxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(this.BoxesVolume);
        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                this.boxes.add(box);
                box = new Box(this.BoxesVolume);
                box.addThing(thing);
            }
        }
        this.boxes.add(box);
        return this.boxes;
    }
}
