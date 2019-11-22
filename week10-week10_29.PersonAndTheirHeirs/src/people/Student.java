/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Warglaive
 */
public class Student extends Person {

    private int Credits;

    public Student(String name, String address) {
        super(name, address);
        this.Credits = 0;
    }

    public void study() {
        this.Credits++;
    }

    public int credits() {
        return this.Credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  " + "credits " + this.Credits;
    }
}
