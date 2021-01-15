
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    public void add(String product, int price){
        if(cart.containsKey(product)){
            cart.get(product).increaseQuantity();
        } else{
            cart.put(product, new Item(product, 1, price));
        }
        
    }
    public int price() {
        int total = 0;
        for(Item each: cart.values()){
            total+=each.price();
        }
        return total;
    }
    public void print(){
        for(Item each: cart.values()){
            System.out.println(each);
        }
    }
}
