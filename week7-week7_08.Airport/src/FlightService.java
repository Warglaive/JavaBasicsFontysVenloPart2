
import java.util.HashMap;
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
public class FlightService {

    private Scanner Scanner;

    FlightService(Scanner scanner) {
        this.Scanner = scanner;
    }

    public String start(Scanner scanner) {
        System.out.println("Flight service\n"
                + "------------\n"
                + "\n"
                + "Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit");

        String operationNumber = scanner.nextLine();
        return operationNumber;
    }

    public void PrintPlanes(AirportPanel airportPanel) {
        for (Plane plane : airportPanel.getPlanes()) {
            System.out.println(plane.toString());
        }
    }

    public void PrintFlights(AirportPanel airportPanel) {
        for (Flight flight : airportPanel.getFlights()) {
            for (Plane plane : airportPanel.getPlanes()) {
                System.out.println(plane.toString() + flight.toString());
            }
        }
    }

    public void PrintPlaneById(AirportPanel airportPanel, Scanner scanner) {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        Plane plane = airportPanel.PlaneById(id);
        System.out.println(plane.toString());
    }
}
