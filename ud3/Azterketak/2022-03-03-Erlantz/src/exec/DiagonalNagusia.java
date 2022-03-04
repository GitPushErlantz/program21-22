/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.Scanner;
import model.Puntua;

/**
 *
 * @author garate.erlantz
 */
public class DiagonalNagusia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Diagonal nagusiko zenbat puntu sortu nahi dituzu? ");
        int kopurua = in.nextInt();
        puntuakInprimatu(puntuakSortu(kopurua));
    }
    
    public static Puntua[] puntuakSortu (int kop) {
        Puntua[] array = new Puntua[kop];
        for(int i = 0; i < kop; ++i){
            array[i] = new Puntua(i, i);
        }
        return array;
    }
    
    public static void puntuakInprimatu(Puntua[] puntuSorta) {
        for (int i = 0; i < puntuSorta.length; ++i) {
            System.out.println(puntuSorta[i].toString());
        }
    }
}
