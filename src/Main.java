import Interfejsi.ISkola;
import Interfejsi.Skola;
import Nasledjivanje.SubKlasaNastavnik;
import Nasledjivanje.SubKlasaUcenik;
import Nasledjivanje.SuperKlasaOsoba;
import Static.AppLog;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        SubKlasaNastavnik subKlasaNastavnik=new SubKlasaNastavnik();
//        SubKlasaUcenik subKlasaUcenik=new SubKlasaUcenik();
//        subKlasaNastavnik.setIme("Kosta");
//        System.out.println("Ime nastavnika je : " + subKlasaNastavnik.getIme());
//        System.out.println("Svi podaci su : " + subKlasaNastavnik.getIme()+"\n"+subKlasaUcenik.toString());
//        subKlasaUcenik.setOcjene(5);
//        subKlasaUcenik.setRazred(9);
//        System.out.println("Ucenik podaci : " +subKlasaUcenik.toString());
//
//
//        //INTEFREJSI
//        Skola skola=new Skola();
//        System.out.println(skola.print());


        AppLog al1 = new AppLog();
        al1.write(3401,"Greska povezivanja");

        AppLog al2 = new AppLog();
        al2.write(5000,"Greska 5000");
    }
}
