
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ericjiang
 */
public class Warehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> product2;

    public Warehouse() {
        this.product = new HashMap<>();
        this.product2 = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        this.product2.put(product, stock);
    }

    public int price(String product) {
        return this.product.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.product2.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.product2.containsKey(product)) {
            int answer = this.product2.get(product) - 1;
            if (answer > 0) {
                this.product2.put(product, answer);
                return true;
            }
            if (answer == 0) {
                this.product2.remove(product);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> answer = product.keySet();
        return answer;
    }
}
