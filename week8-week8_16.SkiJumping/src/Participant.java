
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
public class Participant {

    private String Name;
    private int Points;
    private ArrayList<Integer> JumpLengths;

    public Participant(String name) {
        this.Name = name;
        this.Points = 0;
        this.JumpLengths = new ArrayList<Integer>();
    }
}
