/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Enpresa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author garate.erlantz
 */
public class ErosketenKudeaketa {

    private static ArrayList<Bezeroa> kontaktuak = new ArrayList();
    private static ArrayList<Produktua> produktuKatalogoa = new ArrayList();
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList();

    public static void main(String[] args) {
        int aukera;
        initialize();
        aukera = menuNagusiaErakutsi();
    }

    public static int menuNagusiaErakutsi() {
        Scanner in = new Scanner(System.in);
        int aukera;
        do {
            System.out.println("*********************************************");
            System.out.println("*  EROSKETEN KUDEAKETA");
            System.out.println("*  ---------------------------------------");
            System.out.println("*  1.  Create (Datuak gehitu)");
            System.out.println("*  2.  Read (Ikusi)");
            System.out.println("*  3.  Update (Aldatu)");
            System.out.println("*  4.  Delete (Ezabatu)");
            System.out.println("*  20. Irten");
            System.out.println("*  ---------------------------------------");
            System.out.print("* Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
        } while (aukera > 5 || aukera < 1 || aukera != 20);
        return aukera;
    }

    public static void initialize() {
        String[] emailak = new String[2];

        emailak[0] = "idazkaria@uni.eus";
        emailak[1] = "zuzendaria@uni.eus";
        Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g DONOSTIA", "mbera@donostia.eus");
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza pasealekua z/g ZARAUTZ", "kargi@zarautz.eus");
        Bezeroa UniEibarErmua = new Enpresa(3, "Uni Eibar-Ermua", "Uni", "Otaola Etorbidea 29 EIBAR", emailak);
        kontaktuak.add(martin);
        kontaktuak.add(karlos);
        kontaktuak.add(UniEibarErmua);
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua pavilion = new Produktua("C02", "HP Pavilion", 600);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua iPhoneXX = new Produktua("T02", "iPhone XX", 1300);

        produktuKatalogoa.add(toshiba);
        produktuKatalogoa.add(pavilion);
        produktuKatalogoa.add(samsung);
        produktuKatalogoa.add(iPhoneXX);

        ArrayList<Produktua> produktuak = new ArrayList();
        produktuak.add(toshiba);
        produktuak.add(pavilion);
        produktuak.add(samsung);
        ArrayList<Integer> unitateak = new ArrayList();
        unitateak.add(4);
        unitateak.add(2);
        unitateak.add(3);

        erosketenZerrenda.add(new Erosketa("1.Erosketa", LocalDate.of(2022, 02, 15), martin, produktuak, unitateak, 3630));

        ArrayList<Produktua> produktuak2 = new ArrayList();
        produktuak2.add(toshiba);
        ArrayList<Integer> unitateak2 = new ArrayList();
        unitateak2.add(15);

        erosketenZerrenda.add(new Erosketa("2.Erosketa", LocalDate.of(2022, 02, 16), karlos, produktuak2, unitateak2, 6750));

        ArrayList<Produktua> produktuak3 = new ArrayList();
        produktuak3.add(toshiba);
        produktuak3.add(samsung);
        ArrayList<Integer> unitateak3 = new ArrayList();
        unitateak3.add(1);
        unitateak3.add(1);

        erosketenZerrenda.add(new Erosketa("3.Erosketa", LocalDate.of(2022, 02, 17), karlos, produktuak3, unitateak3, 660));
        System.out.println(erosketenZerrenda);
    }
}
