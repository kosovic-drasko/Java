import Interfejsi.ISkola;
import Interfejsi.Skola;
import Nasledjivanje.SubKlasaNastavnik;
import Nasledjivanje.SubKlasaUcenik;
import Nasledjivanje.SuperKlasaOsoba;

public class Main {
    public static void main(String[] args) {

        SubKlasaNastavnik subKlasaNastavnik=new SubKlasaNastavnik();
        SubKlasaUcenik subKlasaUcenik=new SubKlasaUcenik();
        subKlasaNastavnik.setIme("Kosta");
        System.out.println("Ime nastavnika je : " + subKlasaNastavnik.getIme());
        System.out.println("Svi podaci su : " + subKlasaNastavnik.getIme()+"\n"+subKlasaUcenik.toString());
        subKlasaUcenik.setOcjene(5);
        subKlasaUcenik.setRazred(9);
        System.out.println("Ucenik podaci : " +subKlasaUcenik.toString());


        //INTEFREJSI
        Skola skola=new Skola();
        System.out.println(skola.print());
    }

}