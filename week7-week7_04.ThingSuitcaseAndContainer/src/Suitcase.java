
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Suitcase {

    private ArrayList<Thing> things;
    private final int MaxWeigthLimit;
    private int totalCurrentWeigth;

    public Suitcase(int maxWeigthLimit) {
        this.things = new ArrayList<Thing>();
        this.MaxWeigthLimit = maxWeigthLimit;
        this.totalCurrentWeigth = 0;
    }

    public void addThing(Thing thing) {
        this.totalCurrentWeigth += thing.getWeight();
        if (this.totalCurrentWeigth <= this.MaxWeigthLimit) {
            this.things.add(thing);
        }
    }

    public String toString() {
        int thingsCount = this.things.size();
        int weigth = 0;
        for (Thing thing : things) {
            weigth += thing.getWeight();
        }
        if (thingsCount == 0) {
            return "empty (0 kg)";
        } else if (thingsCount == 1) {
            return thingsCount + " thing (" + weigth + " kg)";
        }
        return thingsCount + " things (" + weigth + " kg)";
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Thing thing : things) {
            sum += thing.getWeight();
        }
        return sum;
    }

    public Thing heaviestThing() {
        Thing result = new Thing("", 0);
        int currentWeigth = Integer.MIN_VALUE;
        for (Thing thing : things) {
            if (currentWeigth < thing.getWeight()) {
                currentWeigth = thing.getWeight();
                result = thing;
            }
        }
        if (this.things.isEmpty()) {
            return null;
        }
        return result;
    }
}
