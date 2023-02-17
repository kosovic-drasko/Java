import java.util.Scanner;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int broj;
        int tajniBroj = 54;
        try (Scanner s = new Scanner(System.in)) {
             System.out.print("Unesite broj:  ");
            broj = s.nextInt();
           

            for (int i = 0; i <8; i++) {

                // System.out.println(i);

                if (broj == tajniBroj) {

                    // System.out.println("Unjeli ste pravi broj");

                    // System.out.println("Unjeli ste broj: "+broj);
                    System.out.println("Brejk");
                    break;
                } else {
                   
                    System.out.print("Los broj");

                    System.out.print("Unjeli ste broj: "+broj);
                     System.out.print(i);
                }
                // System.out.println(i);

            }
            System.out.println("Zavrsavam uslove");
        }

    }

}
