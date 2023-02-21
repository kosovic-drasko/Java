package Java.Nizovi;

import java.util.Scanner;

public class mainNiz {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int niz[] = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.print("Unesite broj:  ");
                niz[i] = s.nextInt();

            }
            double suma=0;
            for (int i = 0; i < 3; i++) {
                suma += niz[i];
            }
            double srednjaVrijednost=suma/3.0;
            System.out.println("Ukupno je:  "+suma);
            
System.out.println("Prosjecna vrijednost je: "+srednjaVrijednost);
        }
    }
    
}
