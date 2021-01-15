
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ericjiang
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> dictionary;

    public VehicleRegistry() {
        this.dictionary = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (dictionary.containsKey(licensePlate)) {
            return false;
        }
        dictionary.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return dictionary.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (dictionary.containsKey(licensePlate)) {
            dictionary.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate each : dictionary.keySet()) {
            System.out.println(each);

        }
    }

    public void printOwners() {
        HashSet<String> convert = new HashSet<String>(dictionary.values());
        
        for (String each : convert) {
            System.out.println(each);

        }
     {
            
        }
    }
}
