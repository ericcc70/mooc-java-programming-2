/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Person {
    private String x;
    private String y;
    public Person(String x, String y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return x+"\n"+"  "+y;
    }
    
}
