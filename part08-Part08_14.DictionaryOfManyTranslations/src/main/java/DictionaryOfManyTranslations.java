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
import java.util.Collections;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    public void add(String word, String translation){
        dictionary.putIfAbsent(word, new ArrayList<String>());
        dictionary.get(word).add(translation);
    }
    public ArrayList<String> translate(String word){
        ArrayList<String> empty = new ArrayList<String>();
        return dictionary.getOrDefault(word, empty);
    }
    public void remove(String word){
        dictionary.remove(word);
    }
}
