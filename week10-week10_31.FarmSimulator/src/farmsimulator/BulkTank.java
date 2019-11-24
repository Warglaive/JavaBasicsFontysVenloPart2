/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Warglaive
 */
public class BulkTank {

    private final double StandartCapacity = 2000;
    private double Capacity;
    private double Tank;

    public BulkTank() {
        this.Capacity = this.StandartCapacity;
    }

    public BulkTank(double capacity) {
        this.Capacity = capacity;
    }

    public double getCapacity() {
        return this.Capacity;
    }

    public double getVolume() {
        return this.Tank;
    }

    public double howMuchFreeSpace() {
        return this.Capacity - this.Tank;
    }

    public void addToTank(double amount) {
        this.Tank += amount;
        if (this.Tank > this.Capacity) {
            this.Tank = this.Capacity;
        }
    }

    public double getFromTank(double amount) {
        this.Tank -= amount;
        if (this.Tank < 0) {
            this.Tank = 0;
        }
        return this.Tank;
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
