/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Calculator {

    private Reader reader;
    private int calculationCounter;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        // print the value according to the example above
        int sum = value1 + value2;
        System.out.println("sum of the values" + sum);
        this.calculationCounter++;
    }

    private void difference() {
        // System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        // System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        // print the value according to the example above
        int diff = value1 - value2;
        System.out.println("difference of the values " + diff);
        this.calculationCounter++;
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        // print the value according to the example above
        int product = value1 * value2;
        System.out.println("product of the values " + product);
        this.calculationCounter++;
    }

    private void statistics() {
        System.out.println("Calculations done " + this.calculationCounter);
    }
}
