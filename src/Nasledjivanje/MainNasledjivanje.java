package Nasledjivanje;

import java.io.FileNotFoundException;

public class MainNasledjivanje {
    public static void main(String[] args) throws FileNotFoundException {
        SuperKlasaOsoba superKlasaOsoba = new SuperKlasaOsoba("dejan","kosovic");
//        superKlasaOsoba.toString();
        SubKlasaNastavnik subKlasaNastavnik=new SubKlasaNastavnik("Boban","Lakic", "matematika");
//        superKlasaOsoba.setIme("Kosta");
        System.out.println(superKlasaOsoba.toString());
        System.out.println("To je nastavnik  "+subKlasaNastavnik.toString());
        System.out.println("Predmet je  "+subKlasaNastavnik.getPredmet());
    }
}
