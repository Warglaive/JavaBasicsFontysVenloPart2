
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class CustomComparator implements Comparator<Participant> {

    @Override
    public int compare(Participant o1, Participant o2) {
        return o1.GetPoints() - o2.GetPoints();
    }
}
