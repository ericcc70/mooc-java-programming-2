
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
public class Pipe<T> {
    ArrayList<T> list;
    public Pipe(){
        list = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        list.add(value);
    }
    public T takeFromPipe() {
        if(list.isEmpty()){
            return null;
        }
        T answer = list.get(0);
        list.remove(0);
        return answer;
    }
    public boolean isInPipe(){
        if(list.isEmpty()){
            return false;
        }
        return true;
    }
}
