
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
public class Statistics {
        private List<Integer> numbers;
        public Statistics(){
            this.numbers = new ArrayList<>();
        }
    public void add(int number) {
        this.numbers.add(number);
    }
    public double average() {
        return this.numbers.stream().mapToInt(i->i).average().getAsDouble();
    }
}
