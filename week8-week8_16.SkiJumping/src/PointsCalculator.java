
import java.util.ArrayList;
import java.util.Collections;
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
public class PointsCalculator {

    private final int lowestJumpLength = 60;
    private final int highestJumpLength = 120;
    private final int judgeLowestVote = 10;
    private final int judgeHighestVote = 20;
    private final int judgesCount = 5;
    private ArrayList<Participant> Participants;

    public PointsCalculator() {
        this.Participants = new ArrayList<Participant>();
    }

    public void AddParticipant(Participant participant) {
        this.Participants.add(participant);
    }

    public void Start() {

    }

    public int CalculateJumperTotalPoints() {
        Random r = new Random();
        int jumpLength = GetJumpLength(r);
        int judgesVote = GetJudgesVote(r);
        int totalPoints=jumpLength+judgesVote;
        return totalPoints;
    }

    public int GetJudgesVote(Random r) {
        ArrayList<Integer> allVotes = new ArrayList<Integer>();
        for (int i = 0; i < this.judgesCount; i++) {
            allVotes.add(r.nextInt(this.judgeHighestVote - this.judgeLowestVote) + this.judgeLowestVote);
        }
        Collections.sort(allVotes);
        allVotes.remove(0);
        allVotes.remove(allVotes.size() - 1);
        int result = 0;
        for (Integer allVote : allVotes) {
            result += allVote;
        }
        return result;
    }

    public int GetJumpLength(Random r) {
        return r.nextInt(this.highestJumpLength - this.lowestJumpLength) + this.lowestJumpLength;
    }

    public ArrayList<Participant> GetParticipants() {
        return this.Participants;
    }
}
