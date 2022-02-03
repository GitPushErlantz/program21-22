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
public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private Demarkazioa demarcacion;

    public Futbolista(int dorsal, Demarkazioa demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrenar() {
        System.out.println("Estoy entrenando.");
    }

    public void jugarPartido() {
        System.out.println("Estoy jugando.");
    }

    @Override
    public String toString() { //apellidos, edad error
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + getApellidos() + '}';
    }
}
