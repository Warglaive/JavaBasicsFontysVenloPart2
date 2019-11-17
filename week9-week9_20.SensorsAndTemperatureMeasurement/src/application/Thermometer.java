/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Warglaive
 */
public class Thermometer implements Sensor {

    private final int lowerDegreeBorder = -30;
    private final int upperDegreeBorder = 30;

    private boolean isOn;

    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override

    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn) {
            Random random = new Random();
            int temperature = random.nextInt(upperDegreeBorder - lowerDegreeBorder) + lowerDegreeBorder;
            return temperature;
        }
        throw new IllegalStateException();
    }

}
