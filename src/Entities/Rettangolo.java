package Entities;

import java.util.Random;

public class Rettangolo {
    public int base;
    public int altezza;



    public  Rettangolo(){
        Random rndm = new Random();
        this.base = rndm.nextInt(1,100);
        this.altezza = rndm.nextInt(1,100);
    }

    public Rettangolo(int base,int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    public int calcolaArea() {
        return base * altezza;
    }


    public  void stampaRettangolo(){
        System.out.println("perimetro: " + calcolaPerimetro() + " area: " + calcolaArea() );
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        int perimetro1 = rettangolo1.calcolaPerimetro();
        int area1 = rettangolo1.calcolaArea();

        int perimetro2 = rettangolo2.calcolaPerimetro();
        int area2 = rettangolo2.calcolaArea();

        System.out.println("Rettangolo 1 - Perimetro: " + perimetro1 + ", Area: " + area1);
        System.out.println("Rettangolo 2 - Perimetro: " + perimetro2 + ", Area: " + area2);

        int sommaAree = area1 + area2;
        int sommaPerimetri = perimetro1 + perimetro2;

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
