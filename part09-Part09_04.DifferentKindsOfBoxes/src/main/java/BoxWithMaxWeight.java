
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> box;
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
        
    }
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item each : this.box) {
            totalWeight += each.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.capacity) {
            this.box.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
    
}
