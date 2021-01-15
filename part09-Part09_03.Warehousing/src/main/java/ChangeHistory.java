/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> dictionary;
    public ChangeHistory(){
        dictionary = new ArrayList<>();
    }
    public void add(double status){
        dictionary.add(status);
    }
    public void clear(){
        dictionary.clear();
    }
    public String toString() {
        return dictionary.toString();
    }
    public double maxValue() {
        if(dictionary.size()==0){
            return 0;
        }
        double answer = dictionary.get(0);
        for(double each: dictionary){
            if (each>answer){
                answer = each;
            }
        }
        return answer;
    }
    public double minValue() {
        if(dictionary.size()==0){
            return 0;
        }
        double answer = dictionary.get(0);
        for(double each: dictionary){
            if (each<answer){
                answer = each;
            }
        }
        return answer;
    }
    public double average(){
        int count = 0;
        double total = 0;
        for(double each: dictionary){
            count+=1;
            total+=each;
        }
        if(count!=0){
            return total/count;
        }
        return 0;
    }
    
}
