/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ericjiang
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> hello;
    private ArrayList<Integer> readings;
    public AverageSensor(){
        hello = new ArrayList<>();
        readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        hello.add(toAdd);
    }
    @Override
    public boolean isOn() {
        for(Sensor each: hello){
            if(!each.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor each: hello){
            each.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor each: hello){
            each.setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn()){
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor each : hello) {
            sum += each.read();
        }
        int reading = sum / hello.size();
        readings.add(reading);
        return reading;
    }
    public List<Integer> readings(){
        return readings;
    }
    
}
