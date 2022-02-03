package exekutagarriak;

import java.util.ArrayList;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  
 * 
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public static ArrayList <IntegranteSeleccion> selekzioa;
    
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        Futbolista f1 = new Futbolista(11, Demarkazioa.DEL, azkenId, "Asier", "Villalibre", 23);
    }
    
   /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        Masajista m1 = new Masajista("fisioterapeuta", 7, azkenId, "Iñaki", "Sertxiberrieta", 43);
        azkenId++;
        Masajista m2 = new Masajista("medico", 4, azkenId, "Ander", "Etxeburu", 30);
        azkenId++;
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
        
            selekzioa.add(new Futbolista(1,Demarkazioa.POR,++azkenId,"Aitor", "Fernandez", 30));
            selekzioa.add(new Futbolista(2,Demarkazioa.DEF,++azkenId,"Unai", "Bustinza", 29));
            selekzioa.add(new Futbolista(3,Demarkazioa.DEF,++azkenId,"Mikel", "Balenziaga", 33));
            selekzioa.add(new Futbolista(4,Demarkazioa.MED,++azkenId,"Asier", "Illarramendi", 31));
            selekzioa.add(new Futbolista(5,Demarkazioa.DEF,++azkenId,"Iñigo", "Martinez", 30));
            selekzioa.add(new Futbolista(6,Demarkazioa.MED,++azkenId,"Mikel", "San Jose", 32));       
            selekzioa.add(new Futbolista(7,Demarkazioa.DEF,++azkenId,"Gaizka", "Larrazabal", 24));
            selekzioa.add(new Futbolista(8,Demarkazioa.MED,++azkenId,"Manu", "Garcia", 35));  
            selekzioa.add(new Futbolista(9,Demarkazioa.DEL,++azkenId,"Aritz", "Aduriz", 40)); 
            selekzioa.add(new Futbolista(10,Demarkazioa.MED,++azkenId,"Javier", "Eraso", 31));     
            selekzioa.add(new Futbolista(11,Demarkazioa.DEL,++azkenId,"Asier", "Villalibre", 23));
            selekzioa.add(new Futbolista(12,Demarkazioa.DEF,++azkenId,"Aihen", "Muñoz", 24));  
            selekzioa.add(new Futbolista(13,Demarkazioa.POR,++azkenId,"Iago", "Herrerín", 34));       
            selekzioa.add(new Futbolista(14,Demarkazioa.DEF,++azkenId,"Aritz", "Elustondo", 27));
            selekzioa.add(new Futbolista(15,Demarkazioa.DEF,++azkenId,"Jesús", "Areso", 22));     
            selekzioa.add(new Futbolista(16,Demarkazioa.DEL,++azkenId,"Iñigo", "Vicente", 24));
            selekzioa.add(new Futbolista(17,Demarkazioa.DEF,++azkenId,"Daniel", "Vivian", 22));
            selekzioa.add(new Entrenador("Euskal selekzioa", 1, "Francisco", "Padalino", 40));  
            selekzioa.add(new Entrenador("Euskal selekzioa", 2, "Joseba", "Núñez", 40));  
            selekzioa.add(new Entrenador("Euskal selekzioa", 3, "Markel", "Lautadahandi", 40)); 
            selekzioa.add(new Masajista("Fisioterapeuta", 21, 1, "Iñaki", "Sertxiberrieta", 41));
            selekzioa.add(new IntegranteSeleccion(1, "Ander", "Etxeburu", 21)); 
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        if(selekzioa.get(id) != null){
            selekzioa.remove(id);
            return true;
        }
        return false;
    }
}
