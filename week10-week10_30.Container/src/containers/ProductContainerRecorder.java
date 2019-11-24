package containers;

import containers.ProductContainer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory Container;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.Container = new ContainerHistory();
        this.Container.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history() {
        return this.Container.toString();
    }

    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.Container.add(super.getVolume());
    }

    public double takeFromTheContainer(double amount) {
        double r = super.takeFromTheContainer(amount);
        this.Container.add(super.getVolume());
        return r;
    }

    public void printAnalysis() {
        //product
        System.out.println("Product: " + super.getName());
        //History
        System.out.println("History: " + this.Container.toString());
        //Greatest product amount: 
        System.out.println("Greatest product amount: " + this.Container.maxValue());
        //Smallest product amount: 
        System.out.println("Smallest product amount: " + this.Container.minValue());
        //avg
        System.out.println("Average: " + this.Container.average());
        //Greatest change: 
        System.out.println("Greatest change: " + this.Container.greatestFluctuation());
        //variance
        System.out.println("Variance: "+this.Container.variance());
        
    }
}
