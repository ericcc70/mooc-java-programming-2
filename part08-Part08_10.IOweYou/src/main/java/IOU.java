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
public class IOU {
    private HashMap<String, Double> dictionary;
    public IOU(){
        this.dictionary = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        dictionary.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return dictionary.getOrDefault(toWhom,0.0);
    }
}
