
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
public class Herd implements Movable{
    private ArrayList<Movable> list;
    public Herd(){
        list = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable each: list){
            each.move(dx, dy);
        }
    }
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    public String toString(){
        String answer="";
        for(Movable each: list){
            answer = answer + each.toString()+"\n";
        }
        return answer;
    }
    
}
