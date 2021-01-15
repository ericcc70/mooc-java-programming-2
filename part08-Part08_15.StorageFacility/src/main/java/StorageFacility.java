/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
import java.util.HashMap;
import java.util.ArrayList;
public class StorageFacility {
    private HashMap<String, ArrayList<String>> dictionary;
    public StorageFacility(){
        this.dictionary = new HashMap<>();
    }
    public void add(String unit, String item){
        dictionary.putIfAbsent(unit, new ArrayList<String>());
        dictionary.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> empty = new ArrayList<String>();
        return dictionary.getOrDefault(storageUnit, empty);
    }
    public void remove(String storageUnit, String item){
        dictionary.get(storageUnit).remove(item);
        if(dictionary.get(storageUnit).size()==0){
            dictionary.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<>(dictionary.keySet());
        return keys;
    }
}
