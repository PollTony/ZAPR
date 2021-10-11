package DU;

import java.util.Scanner;

public class DU2 {

    public static void main(String[] args) {

        //Načíst text přes Scanner
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte jméno a přijmení: ");
        String text = vstup.nextLine();
        System.out.println(text);

        //Načíst číslo a vypsat, zda je kladné, záporné, nebo nula.
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte cislo: ");
        int cislo = vstup.nextInt();

        if (cislo == 0) {
            System.out.println("Zadali jste nulu.");
        }
        if (cislo < 0) {
            System.out.println("Zadali jste záporné číslo.");
        }
        if (cislo > 0) {
            System.out.println("Zadali jste kladné číslo.");
        }

//        //Načíst číslo a vypsat, zda je kladné, záporné, nebo nula.
//        Scanner jedna = new Scanner(System.in);
//        System.out.println("Zadejte první číslo: ");
//        int cisloJedna = jedna.nextInt();
//        Scanner dva = new Scanner(System.in);
//        System.out.println("Zadejte druhé číslo: ");
//        int cisloDva = dva.nextInt();
//        Scanner tri = new Scanner(System.in);
//        System.out.println("Zadejte třetí číslo:");
//        int cisloTri = tri.nextInt();
//
//        if (cisloJedna  cisloDva) {
//            System.out.println("hovno");
//        }
    }
}