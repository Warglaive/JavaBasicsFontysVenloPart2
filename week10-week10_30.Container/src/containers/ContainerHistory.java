/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author Warglaive
 */
public class ContainerHistory {

    private ArrayList<Double> HistoryContainer;

    public ContainerHistory() {
        this.HistoryContainer = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.HistoryContainer.add(situation);
    }

    public void reset() {
        this.HistoryContainer.clear();
    }

    public String toString() {
        return this.HistoryContainer.toString();
    }

    public double maxValue() {
        if (this.HistoryContainer.isEmpty()) {
            return 0;
        }
        Double smallestValue = Double.MIN_VALUE;
        for (Double num : HistoryContainer) {
            if (num > smallestValue) {
                smallestValue = num;
            }
        }
        return smallestValue;
    }

    public double minValue() {
        if (this.HistoryContainer.isEmpty()) {
            return 0;
        }
        Double smallestValue = Double.MAX_VALUE;
        for (Double num : HistoryContainer) {
            if (num < smallestValue) {
                smallestValue = num;
            }
        }
        return smallestValue;
    }

    public double average() {
        double sum = 0;
        if (this.HistoryContainer.isEmpty()) {
            return 0;
        }
        for (Double num : HistoryContainer) {
            sum += num;
        }
        return (sum / this.HistoryContainer.size());
    }

    public double greatestFluctuation() {
        if (this.HistoryContainer.size() < 2) {
            return 0;
        }
        int i = 0;
        double result = 0;
        for (Double num : HistoryContainer) {
            double temp = this.HistoryContainer.get(i + 1);
            double maxTemp = Math.abs(num - temp);
            if (maxTemp > result) {
                result = maxTemp;
            }
            i++;
            if (i >= this.HistoryContainer.size() - 1) {
                break;
            }
        }
        return result;
    }

    public double variance() {
        if (this.HistoryContainer.size() < 2) {
            return 0;
        }
        double result = 0;
        double average = this.average();
        for (Double num : HistoryContainer) {
            double innerResult = num - average;
            result += Math.pow(innerResult, 2);
        }
        result /= (this.HistoryContainer.size() - 1);
        return result;
    }
}
