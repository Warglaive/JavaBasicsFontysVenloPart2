/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Plane {

    public final String ID;
    public final int Capacity;

    public Plane(String Id, int capacity) {
        this.ID = Id;
        this.Capacity = capacity;
    }

    @Override
    public String toString() {
        return this.ID + " (" + this.Capacity + " ppl) ";
    }
}
