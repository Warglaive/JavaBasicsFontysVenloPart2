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
public class Teacher extends Person {

    private int Salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.Salary = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.Salary + " euros/month";
    }
}
