
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
public class OneItemBox extends Box{
    private ArrayList<Item> box;
    public OneItemBox(){
        this.box = new ArrayList<>();
    }
    public void add(Item item){
        if(this.box.size()==0){
            this.box.add(item);
        }
    }
    public boolean isInBox(Item item){
        return box.contains(item);
    }
}
