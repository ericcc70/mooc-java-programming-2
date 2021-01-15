/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Student extends Person {
    private int credit;
    public Student(String x, String y) {
        super(x, y);
        this.credit = 0;
    }
    public void study(){
        credit+=1;
    }
    public int credits(){
        return this.credit;
    }

    public String toString() {
        return super.toString()+"\n"+"  "+"Study credits "+this.credit;
    }
}
