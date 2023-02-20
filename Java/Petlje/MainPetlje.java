import java.util.Scanner;

public class MainPetlje {
    public static void main(String[] args) {
      
      
        try (Scanner s = new Scanner(System.in)) {
            int tajniBroj = 54;
            
            for (int i = 0; i < 5; i++) {
               
               System.out.print("Unesite broj za petlju:  ");
               int broj = s.nextInt();
                // System.out.print("Unesite broj za tajni broj:  ");
                // tajniBroj = s.nextInt();
                if (broj == tajniBroj) {
                    System.out.println("unjeli ste tajni broj  " + tajniBroj);
                 
                 break;
                }
                else{
                    System.out.println(i);
                    System.out.println("Broj koji ste unjeli nije tajni broj");
                    
                }
            }
        }
        System.out.println("Program je zavrsen");
        }
       

    //     Scanner s =new Scanner(System.in);
    //     int izbor=-1;

    //     while (izbor !=0){
    //         System.out.print("Unesite broj:  ");
    //         izbor=s.nextInt();
    //         s.nextLine();
    //     }
    //     System.out.println("Kraj programa");
    // }

    }

