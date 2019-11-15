
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class UserInterface {

    private PointsCalculator PointsCalculator;
    private ParticipantFactory factory;

    public UserInterface() {
        this.PointsCalculator = new PointsCalculator();
        this.factory = new ParticipantFactory();
    }

    public void Start(Scanner scanner) {
        TakeParticipantNames(scanner);
        //next phase
        System.out.println("The tournament begins!");
        System.out.print("Write \"jump\" to jump; otherwise you quit: jump");
        String command = scanner.nextLine();
        int roundCounter = 1;
        while (command == "jump") {
            System.out.println("Round " + roundCounter);
            //magiq
            this.PointsCalculator.Start();
            PrintJumpOrder();
            PrintCurrentRound(roundCounter);
            System.out.print("Write \"jump\" to jump; otherwise you quit: jump");
            command = scanner.nextLine();
            roundCounter++;
        }
    }

    public void PrintJumpOrder() {
        System.out.println("Jumping order:");
        ArrayList<Participant> participants = this.PointsCalculator.GetParticipants();
        int counter = 1;
        for (Participant participant : participants) {
            System.out.println(counter + ". " + participant.GetName() + " (" + participant.GetPoints() + " points)");
        }
    }

    public void TakeParticipantNames(Scanner scanner) {
        System.out.println("The tournament begins!");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        System.out.print("  Participant name: ");
        String participantName = scanner.nextLine();
        while (!participantName.equals("")) {
            Participant participant = this.factory.CreateParticipant(participantName);
            this.PointsCalculator.AddParticipant(participant);
            System.out.print("  Participant name: ");
            participantName = scanner.nextLine();
        }
    }

    private void PrintCurrentRound(int roundCounter) {
        System.out.println("Results of round " + roundCounter);
        ArrayList<Participant> participants = this.PointsCalculator.GetParticipants();

        for (Participant participant : participants) {
            System.out.println("  " + participant.GetName());
            //print jumpLength somehow
            System.out.println("    length: ");
        }
    }
}
