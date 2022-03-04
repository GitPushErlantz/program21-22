/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import model.Lerroa;
import model.Norantza;

/**
 *
 * @author garate.erlantz
 */
public class Test2 {

    public static void main(String[] args) {
        Lerroa l = new Lerroa(0, 0, 11, 11);
        System.out.println(l);
        l.move(3, Norantza.GORA);
        System.out.println(l);
        l.move(5, Norantza.ESKUINERA);
        System.out.println(l);
        System.out.println(
        "Lerroa "+l.getZenbatetanMugitua()+" alditan mugitu da.");
}
}
