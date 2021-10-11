package DU;

public class DU4 {
    public static void main(String[] args) {
        boolean hrajePocitac = true;
        int poziceKulkyVBubinku = (int) (Math.random() * 6); // pozice kulky v šestiranném bubínku revolveru
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * 6); // říká, který z otvorů bubínku je vybrán ke střelbě

        System.out.println("Hraje PC");

        while (poziceKulkyVBubinku != poziceBubinku) {
            System.out.println("Nic!");
            poziceBubinku = (int) (Math.random() * 6);

            hrajePocitac = !hrajePocitac;
            if (hrajePocitac) {
                System.out.println("Hraje PC");
            } else {
                System.out.println("Hraješ ty");
            }
        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi! :)");
        } else {
            System.out.println("Prohrál jsi :(");
        }

        // -- dodatečné úkoly --
        // přidat čekání na akci (zmáčknutí spouště) uživatele
        // předělat magickou konstantu 6 na pojmenovanou konstantu a zkoušet hru s různými počty otvorů v revolveru
        // předělat hru na extrémnější variantu, kde se od druhého pokusu už netočí a jde se dál,
        // - tady potřeba napojit konec bubínku na začátek bubínku, aby se pořád otáčel dokola (int proměnná, co se bude zvyšovat a pak modulo % nebo nulování za koncem)

    }
}
