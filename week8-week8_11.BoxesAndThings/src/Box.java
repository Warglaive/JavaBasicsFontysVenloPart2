
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
public class Box implements ToBeStored {

    private double maxCapacity;
    private ArrayList<ToBeStored> things;

    public Box(double maximumWeight) {
        this.maxCapacity = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored book) {
        if (weight() + book.weight() <= this.maxCapacity) {
            this.things.add(book);
        }
    }

    @Override
    public String toString() {
        int count = this.things.size();
        double weight = weight();
        return "Box: " + count + " things, total weight " + weight + " kg";
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing : this.things) {
            weight += thing.weight();
        }
        return weight;
    }
}
