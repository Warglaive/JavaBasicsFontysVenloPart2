
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Container {

    private final ArrayList<Suitcase> Suitcases;
    private final int MaxWeigthLimit;

    public Container(int maxWeigthLimit) {
        this.Suitcases = new ArrayList<Suitcase>();
        this.MaxWeigthLimit = maxWeigthLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        int maxWeigth = 0;
        for (Suitcase Suitcase : Suitcases) {
            maxWeigth += Suitcase.totalWeight();
        }
        if (this.MaxWeigthLimit - maxWeigth >= suitcase.totalWeight()) {
            this.Suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int suitcasesCount = this.Suitcases.size();
        int weigth = 0;
        for (Suitcase Suitcase : this.Suitcases) {
            weigth += Suitcase.totalWeight();
        }

        return suitcasesCount + " suitcases (" + weigth + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : Suitcases) {
            suitcase.printThings();
        }
    }
}
