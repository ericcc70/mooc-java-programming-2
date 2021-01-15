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
public class Abbreviations {
    private HashMap<String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation = sanitizedString(abbreviation);
        directory.put(abbreviation, explanation);

    }
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);

        if(directory.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation){
        abbreviation = sanitizedString(abbreviation);
        return directory.get(abbreviation);
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
}
