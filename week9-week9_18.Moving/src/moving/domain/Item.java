/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Warglaive
 */
public class Item implements Thing, Comparable<Item> {

    private String Name;
    private int Volume;

    public Item(String name, int volume) {
        this.Name = name;
        this.Volume = volume;
    }

    public String getName() {
        return this.Name;
    }

    @Override
    public int getVolume() {
        return this.Volume;
    }

    public String toString() {
        return this.Name + " (" + this.Volume + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        if (this.Volume == o.getVolume()) {
            return 0;
        } else if (this.Volume < o.getVolume()) {
            return -1;
        } else {
            return 1;
        }
    }
}
