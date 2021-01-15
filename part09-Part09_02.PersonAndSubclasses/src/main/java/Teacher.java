/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Teacher extends Person{
    private int z;
    public Teacher(String x, String y, int z){
        super(x, y);
        this.z = z;
    }
    public String toString() {
        return super.toString()+"\n"+"  "+"salary "+this.z+" euro/month";
    }
}
