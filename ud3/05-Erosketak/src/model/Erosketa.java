/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author garate.erlantz
 */
public class Erosketa {

    protected String kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, LocalDate data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea;
        this.data = data;
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", bezeroa=" + bezeroa + ", guztira=" + guztira + "}\n";
    }

    public boolean guztiraEgiaztatu() {
        boolean isChecked = false;
        double prezioOsoa = 0.0;

        for (int i = 0; i < produktuak.size(); i++) {
            prezioOsoa = prezioOsoa + (unitateak.get(i) * produktuak.get(i).getPrezioa());
        }
        if (guztira == prezioOsoa) {
            isChecked = true;
        }

        return isChecked;
    }
}
