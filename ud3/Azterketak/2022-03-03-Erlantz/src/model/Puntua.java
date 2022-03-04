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
public class Puntua implements Movable {

    protected int x;
    protected int y;
    protected int zenbatetanMugitua;

    public Puntua() {
    }

    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getZenbatetanMugitua() {
        return zenbatetanMugitua;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public void move(int zenbat, Norantza norantza) {
        if (norantza.toString().equals("GORA")) {
            this.y += zenbat;
        } else if (norantza.toString().equals("BEHERA")) {
            this.y -= zenbat;
        } else if (norantza.toString().equals("EZKERRERA")) {
            this.x -= zenbat;
        } else if (norantza.toString().equals("ESKUINERA")) {
            this.x += zenbat;
        }
        if (zenbat != 0) {
            ++zenbatetanMugitua;
        }
    }

}
