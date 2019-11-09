
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
public class AirportPanel {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public AirportPanel() {
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public String start(Scanner scanner) {
        System.out.println("Airport panel\n"
                + "--------------------\n"
                + System.lineSeparator()
                + "Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit");
        String operationNumber = scanner.nextLine();
        return operationNumber;
    }

    void AddAirplane(Scanner scanner) {
        Plane plane = CreatePlane(scanner);
        this.planes.add(plane);
    }

    public Plane CreatePlane(Scanner scanner) {
        System.out.print("Give plane ID: ");
        String planeId = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(scanner.nextLine());
        return new Plane(planeId, planeCapacity);
    }

    public void AddFlight(Scanner scanner) {
        Flight flight = CreateFlight(scanner);
        this.flights.add(flight);
    }

    public Flight CreateFlight(Scanner scanner) {
        System.out.print("Give plane ID: ");
        String planeId = scanner.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = scanner.nextLine();
        return new Flight(planeId, departureCode, destinationCode);
    }

    public ArrayList<Plane> getPlanes() {
        return this.planes;
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public Plane PlaneById(String planeId) {
        for (Plane plane : this.planes) {
            if (plane.ID.equals(planeId)) {
                return plane;
            }
        }
        return null;
    }
}
