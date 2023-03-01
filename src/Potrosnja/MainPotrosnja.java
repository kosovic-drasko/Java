package Potrosnja;

import java.util.Scanner;

public class MainPotrosnja {

    public static void main(String[] args) {
        PotrosnjaGoriva potrosnjaGoriva = new PotrosnjaGoriva();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite kolicinu goriva:  ");
        
        potrosnjaGoriva.punjenje(s.nextDouble());
        Scanner k = new Scanner(System.in);
        System.out.print("Unesite koliko ste presli kilimetara:  ");

        potrosnjaGoriva.predjeno(k.nextDouble());
        System.out.println("Sada u rezervoar ima:  " + potrosnjaGoriva.getRezervoar() + " litara" + "  i predjeno je: "
                + potrosnjaGoriva.getPredjeno_km() + " km");
        potrosnjaGoriva.punjenje(s.nextDouble());
        System.out.println("Novo punjenje" + potrosnjaGoriva.getRezervoar());

    }
}
