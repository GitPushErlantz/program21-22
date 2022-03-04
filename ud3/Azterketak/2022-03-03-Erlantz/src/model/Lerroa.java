/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author garate.erlantz
 */
public class Lerroa extends Puntua implements Movable {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Lerroa(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "(" + x1 + ", " + y1 + ") => (" + x2 + ", " + y2 + ")";
    }
    
    @Override
    public void move(int zenbat, Norantza norantza) {
        if (norantza.toString().equals("GORA")) {
            this.y1 += zenbat;
            this.y2 += zenbat;
        } else if (norantza.toString().equals("BEHERA")) {
            this.y1 -= zenbat;
            this.y2 -= zenbat;
        } else if (norantza.toString().equals("EZKERRERA")) {
            this.x1 -= zenbat;
            this.x2 -= zenbat;
        } else if (norantza.toString().equals("ESKUINERA")) {
            this.x1 += zenbat;
            this.x2 += zenbat;
        }
        if (zenbat != 0) {
            ++zenbatetanMugitua;
        }

    }
    
    
    
}
