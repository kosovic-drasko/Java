package Nasledjivanje;

import java.io.FileNotFoundException;

public class MainNasledjivanje {
    public static void main(String[] args) throws FileNotFoundException {
        SuperKlasaOsoba superKlasaOsoba = new SuperKlasaOsoba();
        superKlasaOsoba.toString();
        superKlasaOsoba.setIme("Kosta");
        System.out.println(superKlasaOsoba.toString());
    }
}
