/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung03;

/**
 *
 * @author nurgul
 */
public class Boat extends Vehicle {

    private double draft;
    private short probeller;
    private double cargo;

    public Boat(short wheels, color color, short ps, short door,double draft, short probeller, double cargo ) {
        super(wheels, color, ps, door);
        this.draft = draft;
        this.probeller = probeller;
        this.cargo = cargo;
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getProbeller() {
        return probeller;
    }

    public void setProbeller(short probeller) {
        this.probeller = probeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public void unload() throws InterruptedException {
        
        Thread.sleep(5000);
        setCargo(0);
    }
   @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiefgang von " + getDraft() + " m";
    }}
