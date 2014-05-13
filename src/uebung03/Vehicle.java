/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung03;

/**
 *
 * @author nurgul
 */
public class Vehicle extends BenennbarAbstract implements Benennbar{

    private short wheels;
    private color color;
   private String name;
    
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    enum color {

        BLACK, SILVER, RED, GREY, YELLOW, BLUE
    }
    private short ps;
    private short door;
    private boolean started;
    private short speed;

    public Vehicle(short wheels, color color, short ps, short door) {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.door = door;
        this.started = false;
        this.speed = 0;
    }
public void accelerate(short speed) {
        if (started) {
            this.speed += speed;
        }
        if (speed > 250) {
            this.speed = 250;
        }
    }
    public void slowdown(short speed){
        if (started) {
            this.speed -= speed;
        }
        if (speed < 0) {
            this.speed = 0;
        }}
        
    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoor() {
        return door;
    }

    public void setDoor(short door) {
        this.door = door;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

   
    }

