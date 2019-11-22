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
    public double minValue(){
        //IMPLEMENT IT AFTER GYM!!!
    }
}
