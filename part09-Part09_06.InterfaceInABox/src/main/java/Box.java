
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> box;
    public Box(double capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    @Override
    public double weight() {
        double total = 0;
        for(Packable each: box){
            total+=each.weight();
        }
        return total;
    }
    public void add(Packable it){
        double total = 0;
        for(Packable each: box){
            total+=each.weight();
        }
        if(total+it.weight()<=capacity){
            box.add(it);
        }
    }
    public String toString(){
        return "Box: "+box.size()+" items, total weight "+this.weight()+" kg";
    }
    
    
}
