import Nasledjivanje.SubKlasaNastavnik;
import Nasledjivanje.SuperKlasaOsoba;

public class Main {
    public static void main(String[] args) {

        SubKlasaNastavnik subKlasaNastavnik=new SubKlasaNastavnik();
        subKlasaNastavnik.setIme("Kosta");
        System.out.println("Ime nastavnika je : " + subKlasaNastavnik.getIme());
    }

}