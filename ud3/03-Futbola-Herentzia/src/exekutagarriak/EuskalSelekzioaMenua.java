/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.Demarkazioa;
import model.Masajista;

/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 * <p>
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da,
 * datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez
 * dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * <p>
 * Gero, horrelako menu bat agertuko zaigu:
 * <p>
 * *************************************************************
 * EUSKAL SELEKZIOA ------------------------------------------- 1. Partaideen
 * datuak ikusi 2. Partaideen datuak ikusi taldekatuta 3. Partaideak
 * alfabetikoki inprimatu 4. Aldaketa 5. Bilatu abizenetik 6. Futbolariak
 * alfabetikoki inprimatu
 * <p>
 * <p>
 * <p>
 * **************************************************************
 */
public class EuskalSelekzioaMenua {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void main(String[] args) {
        int aukera = 0;
        Scanner in = new Scanner(System.in);
        selekzioOsoaSortu();
        while (aukera != 20) {
            System.out.println("\n\n**************************************************************");
            System.out.println("*  EUSKAL SELEKZIOA");
            System.out.println("*  -------------------------------------------");
            System.out.println("*  1. Partaideen datuak ikusi");
            System.out.println("*  2. Partaideen datuak ikusi taldekatuta");
            System.out.println("*  3. Partaideak alfabetikoki inprimatu (ez doa)");
            System.out.println("*  4. Aldaketa");
            System.out.println("*  5. Bilatu abizenetik");
            System.out.println("*  6. Futbolariak alfabetikoki inprimatu");
            System.out.println("*  ");
            System.out.println("*  ");
            System.out.print("20.- Irten\n\n");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            if (aukera == 1) {
                partaideakIkusi();
            } else if (aukera == 2) {
                partaideakIkusiTaldekatuta();
            } else if (aukera == 3) {
                System.out.println(":(");
            } else if (aukera == 4) {
                aldaketa();
            } else if (aukera == 5) {
                bilatu();
            } else if (aukera == 20) {
                System.out.println("Agur!");
            }
        }
    }

    public static void selekzioOsoaSortu() {
        selekzioa.add(new Futbolista(1, Demarkazioa.POR, ++azkenId, "Aitor", "Fernandez", 30));
        selekzioa.add(new Futbolista(2, Demarkazioa.DEF, ++azkenId, "Unai", "Bustinza", 29));
        selekzioa.add(new Futbolista(3, Demarkazioa.DEF, ++azkenId, "Mikel", "Balenziaga", 33));
        selekzioa.add(new Futbolista(4, Demarkazioa.MED, ++azkenId, "Asier", "Illarramendi", 31));
        selekzioa.add(new Futbolista(5, Demarkazioa.DEF, ++azkenId, "Iñigo", "Martinez", 30));
        selekzioa.add(new Futbolista(6, Demarkazioa.MED, ++azkenId, "Mikel", "San Jose", 32));
        selekzioa.add(new Futbolista(7, Demarkazioa.DEF, ++azkenId, "Gaizka", "Larrazabal", 24));
        selekzioa.add(new Futbolista(8, Demarkazioa.MED, ++azkenId, "Manu", "Garcia", 35));
        selekzioa.add(new Futbolista(9, Demarkazioa.DEL, ++azkenId, "Aritz", "Aduriz", 40));
        selekzioa.add(new Futbolista(10, Demarkazioa.MED, ++azkenId, "Javier", "Eraso", 31));
        selekzioa.add(new Futbolista(11, Demarkazioa.DEL, ++azkenId, "Asier", "Villalibre", 23));
        selekzioa.add(new Futbolista(12, Demarkazioa.DEF, ++azkenId, "Aihen", "Muñoz", 24));
        selekzioa.add(new Futbolista(13, Demarkazioa.POR, ++azkenId, "Iago", "Herrerín", 34));
        selekzioa.add(new Futbolista(14, Demarkazioa.DEF, ++azkenId, "Aritz", "Elustondo", 27));
        selekzioa.add(new Futbolista(15, Demarkazioa.DEF, ++azkenId, "Jesús", "Areso", 22));
        selekzioa.add(new Futbolista(16, Demarkazioa.DEL, ++azkenId, "Iñigo", "Vicente", 24));
        selekzioa.add(new Futbolista(17, Demarkazioa.DEF, ++azkenId, "Daniel", "Vivian", 22));
        selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Francisco", "Padalino", 40));
        selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Joseba", "Núñez", 40));
        selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Markel", "Lautadahandi", 40));
        selekzioa.add(new Masajista("Fisioterapeuta", 21, ++azkenId, "Iñaki", "Sertxiberrieta", 41));
        selekzioa.add(new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 21));
    }

    public static void partaideakIkusi() {
        int futbolariak = 0;
        int entrenatzaileak = 0;
        int masajistak = 0;
        int besteak = 0;
        System.out.println("\n\nEUSKAL SELEKZIOKO PARTAIDEAK:");
        System.out.println("----------------------------");
        for (int i = 0; i < selekzioa.size(); ++i) {
            System.out.println(selekzioa.get(i));
            if (selekzioa.get(i) instanceof Futbolista) {
                ++futbolariak;
            } else if (selekzioa.get(i) instanceof Entrenador) {
                ++entrenatzaileak;
            } else if (selekzioa.get(i) instanceof Masajista) {
                ++masajistak;
            } else {
                ++besteak;
            }
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("GUZTIRA: " + futbolariak + " futbolari, " + entrenatzaileak + " entrenatzaile, " + masajistak + " masajista eta beste " + besteak);
    }

    public static void partaideakIkusiTaldekatuta() {
        int futbolariak = 0;
        int entrenatzaileak = 0;
        int masajistak = 0;
        int besteak = 0;
        System.out.println("\n\nEUSKAL SELEKZIOKO PARTAIDEAK TALDEKA:");
        System.out.println("----------------------------");
        System.out.println("FUTBOLARIAK");
        System.out.println("------------");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) instanceof Futbolista) {
                System.out.println(selekzioa.get(i));
                ++futbolariak;
            }
        }
        System.out.println("    Guztira: " + futbolariak + " futbolari\n");

        System.out.println("ENTRENATZAILEAK");
        System.out.println("---------------");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) instanceof Entrenador) {
                System.out.println(selekzioa.get(i));
                ++entrenatzaileak;
            }
        }
        System.out.println("    Guztira: " + entrenatzaileak + " entrenatzaile\n");

        System.out.println("MASAJISTAK");
        System.out.println("------------");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) instanceof Masajista) {
                System.out.println(selekzioa.get(i));
                ++masajistak;
            }
        }
        System.out.println("    Guztira: " + masajistak + " masajista\n");

        System.out.println("BESTELAKOAK");
        System.out.println("------------");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (!(selekzioa.get(i) instanceof Masajista || selekzioa.get(i) instanceof Entrenador || selekzioa.get(i) instanceof Futbolista)) {
                System.out.println(selekzioa.get(i));
                ++besteak;
            }
        }
        System.out.println("    Guztira: " + besteak + " beste\n");
    }

    public static void aldaketa() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Noren izena nahi duzu aldatu? (Idatzi id-a): ");
        id = in.nextInt();

        for(int i = 0; i < selekzioa.size(); ++i){
            if(selekzioa.get(i).getId() == id){
                System.out.print("Sartu izen berria: ");
                selekzioa.get(i).setNombre(in.next());
                System.out.print("Sartu abizen berria: ");
                selekzioa.get(i).setApellidos(in.next());
                System.out.println("\nOndo aldatu da.");
            }
        }
    }

    public static void bilatu(){
        Scanner in = new Scanner(System.in);
        String abizena;
        System.out.print("Sartu partaidearen abizena: ");
        abizena = in.next();
        for (int i = 0; i < selekzioa.size(); i++) {
            if(abizena.toLowerCase().equals(selekzioa.get(i).getApellidos().toLowerCase())){
                System.out.println(selekzioa.get(i).toString());
            }
        }
    }
}
