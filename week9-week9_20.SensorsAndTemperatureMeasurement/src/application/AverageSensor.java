/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Warglaive
 */
public class AverageSensor implements Sensor {

    private List<Sensor> Sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.Sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public List<Integer> readings() {
        return this.readings;
    }

    public void addSensor(Sensor additional) {
        this.Sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        boolean allAreOn = true;
        for (Sensor sensor : this.Sensors) {
            if (!sensor.isOn()) {
                allAreOn = false;
            }
        }
        return allAreOn;
    }

    @Override
    public void on() {
        if (!isOn()) {
            for (Sensor sensor : this.Sensors) {
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : Sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException("The average sensor is off!!");
        }
        int totalTemperature = 0;
        for (Sensor sensor : Sensors) {
            totalTemperature += sensor.measure();
        }
        totalTemperature = totalTemperature / this.Sensors.size();
        this.readings.add(totalTemperature);
        return totalTemperature;
    }
}
