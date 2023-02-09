package Interfejsi;

import Nasledjivanje.SuperKlasaOsoba;

import java.io.FileNotFoundException;

public class MainInterface {
    public static void main(String[] args) throws FileNotFoundException {
   Skola skola=new Skola();
   skola.kozola();
        System.out.println("Povratna String:  "+skola.print());
    }
}
