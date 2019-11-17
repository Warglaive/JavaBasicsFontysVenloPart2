
import java.util.ArrayList;
import java.util.Random;

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
    private int Length;
    private ArrayList<Integer> JumpLengths;
    private ArrayList<Integer> JudgesVotes;

    public Participant(String name) {
        this.Name = name;
        this.Points = 0;
        this.JumpLengths = new ArrayList<Integer>();
        this.JudgesVotes = new ArrayList<Integer>();
    }

    public String GetName() {
        return this.Name;
    }

    public void SetPoints(int points) {
        this.Points = points;
    }

    public int GetPoints() {
        return this.Points;
    }

    public void SetJudgesVotes(ArrayList<Integer> votes) {
        this.JudgesVotes = votes;
    }

    public void SetJumpLengths(ArrayList<Integer> lengths) {
        this.JumpLengths = lengths;
    }

    public ArrayList<Integer> GetJudgesVotes() {
        return this.JudgesVotes;
    }
}
