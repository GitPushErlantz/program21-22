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
public class Produktua {

    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(char[] kodea, String izena, double prezioa) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
    }

    public String getStrKodea() {
        return kodea.toString();
    }

    public String getIzena() {
        return izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

    @Override
    public String toString() {
        return "Produktua{" + "kodea=" + kodea + ", izena=" + izena + ", prezioa=" + prezioa + '}';
    }
}
