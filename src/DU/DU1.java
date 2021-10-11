package DU;

import java.util.Scanner;

public class DU1 {
    static final double PI = 3.14D;

    public static void main(String[] args) {

        //Převodník galonů na litry
        System.out.println("-- Převodník galonů na litry --");
        int galon = 20;
        double litr = 3.7854D;
        double prevod = (double)galon * litr;
        System.out.println(galon + " galon(ů) = " + prevod);

        //Váha na měsíci
        System.out.println("-- Výpočet váhy na měsíci --");
        double vaha = 92.6D;
        double vahaMesic = vaha / 100.0D * 17.0D;
        System.out.println("Váha na měsíci = " + vahaMesic);

        //Výpočet obvodu kruhu z poloměru
        System.out.println("-- Výpočet obvod kruhu z poloměru --");
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte poloměr kruhu: ");
        double polomerKruhu = vstup.nextDouble();
        double obvodKruhu = 6.28D * polomerKruhu;
        System.out.println("obvod kruhu = " + obvodKruhu);

        //Výpočet obsahu kruhu z poloměru
        System.out.println("-- Výpočet obsahu kruhu z poloměru --");
        Scanner vstupDva = new Scanner(System.in);
        System.out.println("Zadejte poloměr kruhu: ");
        double polomerKruhuDva = vstupDva.nextDouble();
        double obsahKruhu = 3.14D * polomerKruhuDva * polomerKruhuDva;
        System.out.println("Obsah kruhu = " + obsahKruhu);

    }
}