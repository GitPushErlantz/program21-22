/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author garate.erlantz
 */
public class Laukizuzena implements Marrazgarria {

    Puntua erpinBat;
    private Puntua kontrakoErpina;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Laukizuzena(Puntua erpinBat, Puntua kontrakoErpina) {
        this.erpinBat = erpinBat;
        this.kontrakoErpina = kontrakoErpina;
    }

    public Laukizuzena(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }

    public Puntua[] getLauErpinenArraya() {
        Puntua[] array = new Puntua[4];
        array[0] = this.getErpinBat();
        array[1] = new Puntua(this.getKontrakoErpina().getX(), this.getErpinBat().getY());
        array[2] = this.getKontrakoErpina();
        array[3] = new Puntua(this.getErpinBat().getX(), this.getKontrakoErpina().getY());
        return array;
    }

    public ArrayList<Puntua> getLauErpinenArrayLista() {
        ArrayList arrayl = new ArrayList<Puntua>();
        arrayl.add(this.getErpinBat());
        arrayl.add(new Puntua(this.getKontrakoErpina().getX(), this.getErpinBat().getY()));
        arrayl.add(this.getKontrakoErpina());
        arrayl.add(new Puntua(this.getErpinBat().getX(), this.getKontrakoErpina().getY()));
        return arrayl;
    }

    public boolean isInside(Puntua puntuBat) {
        boolean isBarruan = false;
        if ((puntuBat.getX() >= this.getErpinBat().getX() && puntuBat.getX() <= this.getKontrakoErpina().getX()) && (puntuBat.getY() >= this.getErpinBat().getY() && puntuBat.getY() <= this.getKontrakoErpina().getY())) {
            isBarruan = true;
        }

        return isBarruan;
    }

    public double getErtzenLuzera() {
        return abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY());
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getLauErpinenArraya());
    }

    @Override
    public void marraztu() {
        System.out.println(this.toString() + " puntua GUI batean marraztua izan da.");
    }
}
