import java.util.Scanner;

public class MainPetlje {
    public static void main(String[] args) {
        int tajniBroj = 0;
        int broj = 5;
        int i;
       
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Unesite broj za petlju:  ");
            broj = s.nextInt();
            System.out.print("Unesite broj za tajni broj:  ");
            tajniBroj = s.nextInt();
            if (tajniBroj == 8) {
                System.out.println("unjeli ste tajni broj  " + tajniBroj);
    
            }
            else{
                System.out.println("Broj koji ste unjeli nije tajni broj");
            }
        }

        for (i = 0; i < broj; i++) {
            System.out.println(i);
        }

    }
}
