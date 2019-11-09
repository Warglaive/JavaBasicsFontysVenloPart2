
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AirportPanel airportPanel = new AirportPanel();
        Scanner scanner = new Scanner(System.in);
        String operationNumber = airportPanel.start(scanner);

        //Airport panel
        while (!operationNumber.equals("x")) {
            if (operationNumber.equals("1")) {
                airportPanel.AddAirplane(scanner);
            } else if (operationNumber.equals("2")) {
                airportPanel.AddFlight(scanner);
            }
            operationNumber = airportPanel.start(scanner);
        }
        //flight service 
        FlightService flightService = new FlightService(scanner);

        String flightServiceOPNum = flightService.start(scanner);
        while (!flightServiceOPNum.equals("x")) {
            if (flightServiceOPNum.equals("1")) {
                flightService.PrintPlanes(airportPanel);
            } else if (flightServiceOPNum.equals("2")) {
                flightService.PrintFlights(airportPanel);
            } else if (flightServiceOPNum.equals("3")) {
                  flightService.PrintPlaneById(airportPanel, scanner);
            }
            flightServiceOPNum = flightService.start(scanner);
        }
    }
}
