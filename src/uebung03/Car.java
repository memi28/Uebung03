/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung03;

/**
 *
 * @author nurgul
 */
public class Car extends Vehicle {
    private boolean aircondition;
    private short airbag;

    
    public Car( short wheels, color color, short ps, short door,short airbag) {
        super(wheels, color, ps, door);
        this.aircondition = false;
        this.airbag = airbag;
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    public void startAircondition(){
    if (aircondition = false){
        aircondition = true;
        }
        else {
            System.out.println("Die Klimaanlage läuft bereits");
        }
    }
    public void stopAircondition(){ 
        if (aircondition = true){
        aircondition = false;
        }
        else {
            System.out.println("Die Klimaanlage ist bereits aus");
        }}

    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h";
    }
    
 
    
}
