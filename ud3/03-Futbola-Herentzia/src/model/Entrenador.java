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
public class Entrenador {

    private String IdFederacion;

    public Entrenador(String IdFederacion) {
        this.IdFederacion = IdFederacion;
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String IdFederacion) {
        this.IdFederacion = IdFederacion;
    }

    public void dirigirEntrenamiento() {
        System.out.println("Estoy dirigiendo un entrenamiento.");
    }

    public void dirigirPartido() {
        System.out.println("Estoy dirigiendo un partido.");
    }
}
