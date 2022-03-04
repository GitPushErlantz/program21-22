/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import model.Norantza;
import model.Puntua;

/**
 *
 * @author garate.erlantz
 */
public class Test1 {

    public static void main(String[] args) {
        Puntua p1 = new Puntua(5, 5);
        System.out.println("A- p1" + p1);
        p1.move(3, Norantza.GORA);
        System.out.println("B- p1" + p1);
        p1.move(2, Norantza.EZKERRERA);
        System.out.println("C- p1" + p1);
        p1.move(0, Norantza.BEHERA);
        System.out.println("D- p1" + p1);
        System.out.println(p1.getZenbatetanMugitua() + " aldiz mugitua.");
    }
}
