package CV;

import java.util.Scanner;

public class CV4 {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        int nahodneCislo = (int) (Math.random() * 100) + 1;
        System.out.print("Hádej číslo 1-100: ");
        int hadaneCislo = vstup.nextInt();

        while (hadaneCislo != nahodneCislo) {
            if (hadaneCislo < nahodneCislo) {
                System.out.print("Zkus větší číslo: ");
            } else {
                System.out.print("Zkus menší číslo: ");
            }
            hadaneCislo = vstup.nextInt();
        }
        System.out.print("Uhodl jste číslo");
    }
    // přidat počítadlo pokusů, aby se na konci šlo vypsat na kolikátý pokus
    // přidat ukončení hry neúspěchem, pokud to nestihne za nějaký počet pokusů
}
