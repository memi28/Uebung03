/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung03;

import uebung03.Vehicle.color;
import uebung03.Liste;
/**
 *
 * @author nurgul
 */
public class Main {

    public static void main(String[] args) {
        Car bmw = new Car((short) 4, color.SILVER, (short) 220, (short) 5, (short) 4);
        Car audi = new Car((short) 4, color.BLACK, (short) 180, (short) 5, (short) 8);
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
      
        Boat titanic = new Boat((short) 0, color.BLUE, (short) 51000, (short) 0, 10.54, (short) 4, 100000);
        System.out.println(titanic.toString());
        
        
        //Aufgabe2
        Benennbar namedCar = new Car((short) 4, color.RED, (short) 75,(short)5,(short)4);
        namedCar.setName("Name xy");
        System.out.println(namedCar.getName());
        
        //Aufgabe3
        namedCar.setName("Name xx");
        System.out.println(namedCar.getName());
        /*
        //Aufgabe 4 
        Liste  xy = new Liste(3);
        xy.save(2.0);
        xy.save(5.0);
        xy.save(200.0);
        //Ausgabe 
        for(int i = 0; i < xy.getSize(); i++){
            System.out.println(xy.getXy()[i]);
        }
        */
        
        
       // Aufgabe 5 variavle name Vehilearray damit ich weiß das es von der Klasse vehicle erbt
        Liste  vehiclearray = new Liste(3);
        vehiclearray.save(audi);
        vehiclearray.save(bmw);
        vehiclearray.save(titanic);
        //Ausgabe
        for(int i = 0; i < vehiclearray.getSize(); i++){
            System.out.println(vehiclearray.getXy()[i]);
        }
        
    }
}
