/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung03;

/**
 *
 * @author nurgul
 */
//Aufgabe 4   //Aufgabe5 T erbt von extends BenennbarAbstract
public class Liste<T extends BenennbarAbstract> {

    private Object[] xy;

 
    private int size;
    private int index = 0;

    public Liste(int size) {
        this.size = size;
        xy = new Object[this.size];
        //erzeuge ein neues array Object dessen länge durchs size bestimmt wird.

    }
    public void save(T param){
        if(index<size){
            xy[index]=param;
            index++;
        }
        else{
            System.out.println("Mein Array ist voll. ");
        }
        
    }   
    
    
    public Object[] getXy() {
        return xy;
    }

    public void setXy(Object[] xy) {
        this.xy = xy;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
