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
public class Person {

    private String Name;
    private String Address;

    public Person(String name, String address) {
        this.Name = name;
        this.Address = address;
    }

    public String toString() {
        return this.Name + "\n" + "  " + this.Address;
    }
}
