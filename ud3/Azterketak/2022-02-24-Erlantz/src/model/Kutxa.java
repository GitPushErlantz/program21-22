/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author garate.erlantz
 */
public class Kutxa extends Laukizuzena {

    private int altuera;

    public Kutxa(Puntua erpinBat, Puntua kontrakoErpina, int altuera) {
        super(erpinBat, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }

    public boolean isHandiagoa(Kutxa besteKutxaBat) {
        int luz1, zab1, luz2, zab2;
        zab1 = abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX());
        zab2 = abs(besteKutxaBat.erpinBat.getX() - besteKutxaBat.getKontrakoErpina().getX());
        luz1 = abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY());
        luz2 = abs(besteKutxaBat.getErpinBat().getY() - besteKutxaBat.getKontrakoErpina().getY());
        int b1 = zab1 * luz1;
        int b2 = zab2 * luz2;

        if (b1 > b2) {
            return true;
        } else {
            return false;
        }
    }

    public int getBolumena() {
        int bolumena = abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX()) * abs((this.getErpinBat().getY() - this.getKontrakoErpina().getY())) * altuera;
        return bolumena;
    }

    public static Kutxa handiena(ArrayList<Kutxa> kutxak) {
        Kutxa kutxaHandiena = kutxak.get(0);
        for (int i = 0; i < kutxak.size(); i++) {
            if (kutxak.get(i).getBolumena() > kutxaHandiena.getBolumena()) {
                kutxaHandiena = kutxak.get(i);
            }
        }

        return kutxaHandiena;
    }

    @Override
    public String toString() {
        return "Oinarria:[(" + this.getErpinBat().getX() + ", " + this.getErpinBat().getY() + "), (" + this.getKontrakoErpina().getX() + ", " + this.getErpinBat().getY() + "), (" + this.getKontrakoErpina().getX() + ", " + this.getKontrakoErpina().getY() + "), (" + this.getErpinBat().getX() + ", " + this.getKontrakoErpina().getY() + ")] eta altuera:" + altuera;
    }

    public void marraztu() {
        System.out.println(this.toString() + " dituen puntua GUI batean marraztua izan da.");
    }
}
