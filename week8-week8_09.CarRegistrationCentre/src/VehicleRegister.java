
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (this.owners.get(plate) != null) {
            return this.owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.remove(plate) != null) {
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<String>();
        for (String owner : this.owners.values()) {
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
            }
        }
        for (String string : ownersList) {
            System.out.println(string);
        }
    }
}
