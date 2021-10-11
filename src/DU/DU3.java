package DU;

import java.util.Scanner;

public class DU3 {

    public static void main(String[] args) {
        // Měsíce přes switch
        System.out.println("Zadejte měsíc pomocí čísel od 1 do 12 ");
        Scanner mc = new Scanner(System.in);
        int mesic = mc.nextInt();
        switch(mesic)

        {
            case 1:
                System.out.println("Leden");break;
            case 2:
                System.out.println("Únor");break;
            case 3:
                System.out.println("Březen");break;
            case 4:
                System.out.println("Duben");break;
            case 5:
                System.out.println("Květen");break;
            case 6:
                System.out.println("Červen");break;
            case 7:
                System.out.println("Červenec");break;
            case 8:
                System.out.println("Srpen");break;
            case 9:
                System.out.println("Září");break;
            case 10:
                System.out.println("říjen");break;
            case 11:
                System.out.println("Listopad");break;
            case 12:
                System.out.println("Prosinec");break;
            default:
                System.out.println("Zadali jste špatnou hodnotu");break;
        }

        //Faktoriál
        int factorial = 3;
        int result = 1;
        for (int i = 1; i <= factorial; i++){
            result *= i;
        }
        System.out.println("Faktoriál : " + result);

        //Celočíselné dělení
        int divident = 50;
        int divisor2 = 5;
        int resultD = 0;
        int remainder = divident;
        while (remainder >= divisor2){
            resultD++;
            remainder -= divisor2;
        }
        System.out.println("Výsledek dělení : " + resultD);

        // Největší spol dělitel
        int num1 = 40;
        int num2 = 48;
        int divisor =Math.min(num1, num2);
        do {
            --divisor;
        }while (!(num1 % divisor == 0 && num2 % divisor ==0));
        System.out.println("Největší společný dělitel je : " +  divisor);

    }
}
