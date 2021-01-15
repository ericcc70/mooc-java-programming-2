/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int publication;
    public CD(String artist, String name, int publication){
        this.artist = artist;
        this.name = name;
        this.publication = publication;
    }
    @Override
    public double weight() {
        return 0.1;
    }
    public String toString(){
        return artist +": "+name+" ("+publication+")";
    }
    
}
