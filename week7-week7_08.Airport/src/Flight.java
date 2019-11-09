/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Flight {

    public final String PlaneId;
    public final String DepartureCode;
    public final String DestinationCode;

    public Flight(String planeId, String departureCode, String destinationCode) {
        this.PlaneId = planeId;
        this.DepartureCode = departureCode;
        this.DestinationCode = destinationCode;
    }

    @Override
    public String toString() {
        return "(" + this.DepartureCode + "-" + this.DestinationCode + ")";
    }
}
