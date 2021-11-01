package DU;

public class DU6 {

    private DU6() {
        Kruh kruh = new Kruh(5.5);
        System.out.println(kruh);

        SpravcePole spravce = new SpravcePole(10);
        System.out.println(spravce);
        System.out.println("Max: " + spravce.max());
        System.out.println("Min: " + spravce.min());
        System.out.println("Prumer: " + spravce.prumer());
        System.out.println("Suma: " + spravce.suma());
    }

    public static void main(String[] args) {
        new DU6(); }
}

class Kruh {

    //atributy
    private double polomer;

    //konstruktor
    public Kruh(double polomer) {
        this.polomer = polomer; }

    //funkce
    @Override
    public String toString() {return "Poloměr: " + polomer + ", Obvod: " + dejObvod() + ", Obsah: " + dejObsah();}
    public double dejObvod() {return 2*Math.PI*polomer;}
    public double dejObsah() {return Math.PI*polomer*polomer;}
}

class SpravcePole {

    //atributy
    private int[] pole;

    //konstruktor
    public SpravcePole(int delkaPole) {
        this.pole = Array(delkaPole); }

    //pole
    private int[] Array(int delkaPole) {
        int[] arr = new int[delkaPole];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100);
        return arr; }

    //Maximum
    public int max() {
        int pom;
        for (int i = 0; i < this.pole.length; i++) {
            for (int j = 0; j < this.pole.length; j++) {
                if (this.pole[i] > this.pole[j]) {
                    pom = this.pole[i];
                    this.pole[i] = this.pole[j];
                    this.pole[j] = pom;
                }
            }
        }
        return pole[0];
    }

    //Minimum
    public int min() {
        int pom;
        for (int i = 0; i < this.pole.length; i++) {
            for (int j = 0; j < this.pole.length; j++) {
                if (this.pole[i] < this.pole[j]) {
                    pom = this.pole[i];
                    this.pole[i] = this.pole[j];
                    this.pole[j] = pom;
                }
            }
        }
        return this.pole[0];
    }

    //Suma
    public int suma() {
        int result = 0;
        for (int num : this.pole) result += num;
        return result;
    }

    //Průměr
    public double prumer() {return (double) suma() / this.pole.length;}

    //To String
    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < this.pole.length; i++) text += this.pole[i] + ((i != this.pole.length - 1) ? ", " : "");
        return text;
    }
}