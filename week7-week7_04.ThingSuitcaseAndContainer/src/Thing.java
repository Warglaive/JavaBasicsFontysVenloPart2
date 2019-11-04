/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Thing {

    private String name;
    private int weigth;

    public Thing(String name, int weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weigth;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weigth + " kg)";
    }
}
