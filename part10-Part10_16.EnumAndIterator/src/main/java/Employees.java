
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {

    private ArrayList<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(x -> list.add(x));
    }

    public void print() {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
            
            
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                iterator.remove();
            }
            
            
        }
    }
}
