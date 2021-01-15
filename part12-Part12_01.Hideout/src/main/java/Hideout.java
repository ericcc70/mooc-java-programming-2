
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Hideout<T> {
    ArrayList<T> values;
    public Hideout(){
        values = new ArrayList<>();
    }
    public void putIntoHideout(T toHide){
        if(values.size()==1){
            values.clear();
        }
        values.add(toHide);
        
    }
    public T takeFromHideout(){
        if(values.size()==0){
            return null;
        }
        T answer = values.get(0);
        values.clear();
        return answer;
    }
    public boolean isInHideout(){
        if(values.size()==0){
            return false;
        }
        return true;
    }
    
}
