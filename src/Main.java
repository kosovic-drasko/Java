
import Interfejsi.Skola;
import Nasledjivanje.SubKlasaNastavnik;
import Nasledjivanje.SubKlasaUcenik;


public class Main {
    public static void main(String[] args) {

        SubKlasaNastavnik subKlasaNastavnik=new SubKlasaNastavnik();
        SubKlasaUcenik subKlasaUcenik=new SubKlasaUcenik(8,15);
        subKlasaNastavnik.setIme("Kosta");
        System.out.println("Ime nastavnika je : " + subKlasaNastavnik.getIme());
        System.out.println("Svi podaci su : " + subKlasaNastavnik.getIme()+"\n"+subKlasaUcenik.toString());
        subKlasaUcenik.setOcjene(5);
        subKlasaUcenik.setRazred(9);
        System.out.println("Ucenik podaci : " +subKlasaUcenik.toString());



        //INTEFREJSI
        Skola skola=new Skola();
        System.out.println("Pisem iz inteface:   "+skola.print());
        skola.kozola();

    }

}
