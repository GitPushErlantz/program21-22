package exekutagarriak;

import model.*;

import java.util.ArrayList;

public class PartidakKudeatu {
    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    private static Partida[] partidak = new Partida[20];

    public static void main(String[] args) {
        selekzioOsoaSortu();
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

    public static void partidakAsmatu() {
        
    }
}
