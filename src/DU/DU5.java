package DU;

import java.util.Scanner;

public class DU5 {

    public static void main(String[] args) {

        int nahodneCislo = (int) (Math.random() * 100) + 1;
        System.out.print("Máš 10 pokusů na to aby jsi uhádl číslo od 1 do 100\n");
        int hadaneCislo = 0;
        Scanner input = new Scanner(System.in);

        boolean pokacovani = true;

        for (int i = 1; pokacovani; i++) {
            System.out.println("Zadej hádané číslo: ");
            hadaneCislo = input.nextInt();

            if (i == 10  ){
                System.out.println("Došli ti pokusy.\nPROHRÁL JSI!"); break;
            }
            if (hadaneCislo == nahodneCislo) {
                System.out.println("Gratuluji, VYHRÁL JSI! \nStačilo ti k tomu pouze " + i + " pokus(y,ů).");
                pokacovani = false;
            } else if (hadaneCislo < nahodneCislo) {
                System.out.println("Zkus větší číslo");
            } else {
                System.out.println("Zkus menší čílso");
            }
        }



        final int zasobnik = 6;

        boolean hrajePocitac = true;
        int pocitej = 0;
        int poziceKulkyVBubinku = (int) (Math.random() * zasobnik);
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * zasobnik);

        System.out.println("Hraje PC");

        while (poziceKulkyVBubinku != poziceBubinku) {
            System.out.println("Nic!");
            poziceBubinku = (int) (Math.random() * zasobnik);
            if (poziceBubinku < 0) poziceBubinku = zasobnik - 1;
            if (poziceBubinku > zasobnik - 1) poziceBubinku = 0;

            hrajePocitac = !hrajePocitac;
            if (hrajePocitac) {
                System.out.println("Hraje PC");
            } else {
                System.out.println("Hraješ ty");
                System.out.println("Napiš true pro pokračování: ");
                Scanner vstup = new Scanner(System.in);
                boolean cvak = vstup.nextBoolean();
            }
        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi!");
        } else {
            System.out.println("Prohrál jsi!");
        }
    }
}