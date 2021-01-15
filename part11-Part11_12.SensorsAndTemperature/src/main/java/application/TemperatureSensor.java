/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author ericjiang
 */
public class TemperatureSensor implements Sensor{
    private boolean turpine = false;
    @Override
    public boolean isOn() {
        return turpine;
    }

    @Override
    public void setOn() {
        turpine = true;
    }

    @Override
    public void setOff() {
        turpine = false;
    }

    @Override
    public int read() {
        if(turpine==true){
            return new Random().nextInt(61)-30;
        }
        throw new IllegalStateException("Your wrong!");
    }
    
}
