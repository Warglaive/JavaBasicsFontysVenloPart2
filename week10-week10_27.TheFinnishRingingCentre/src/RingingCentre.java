
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class RingingCentre {

    private Map<Bird, List<String>> storage;

    public RingingCentre() {
        this.storage = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        ArrayList<String> places = new ArrayList<String>();
        places.add(place);
        if (this.storage.containsKey(bird)) {
            this.storage.get(bird).add(place);
        } else {
            this.storage.put(bird, places);
        }
    }

    public void observations(Bird bird) {
        int observationsCount = 0;
        if (this.storage.get(bird) != null) {
            observationsCount = this.storage.get(bird).size();
            System.out.println(bird + " observations: " + observationsCount);
            for (String place : this.storage.get(bird)) {
                System.out.println(place);
            }
        } else {

            System.out.println(bird + " observations: 0");
        }

    }
}
