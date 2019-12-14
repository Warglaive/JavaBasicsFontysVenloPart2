/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Warglaive
 */
public class PersonalCalculator implements Calculator {

    private int Counter;

    public PersonalCalculator() {
        this.Counter = 0;
    }

    @Override
    public int giveValue() {
        return this.Counter;
    }

    @Override
    public void increase() {
        this.Counter++;
    }

}
