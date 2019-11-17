
import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Main {

    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new ConstantSensor(3));
        ka.addSensor(new ConstantSensor(7));
        ka.measure();
        ka.readings();
    }
}
