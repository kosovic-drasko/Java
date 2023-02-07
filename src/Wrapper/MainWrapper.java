package Wrapper;

public class MainWrapper {
    public static void main(String[] args){
Vreme v1=Vreme.fromMinutes(15);
        System.out.println("Vreme od minuta:"+v1.toSecunds());
        Vreme v2=Vreme.fromSeconde(150000);
        System.out.println("Vreme od sekunda je sati:"+v2.toHours());

        //prikazatiPredjeniPut(100,2);
    }
//    public static void prikazatiPredjeniPut(double brzina,double vreme ){
//        double predjeniPut=brzina*vreme;
//        System.out.println("Predjeni put je:  "+predjeniPut);
//    }
//public static void prikazatiPredjeniPut(Brzina brzina,Vreme vreme ){
//   Put p=Put.
//    System.out.println("Predjeni put je:  "+predjeniPut);
//}
}
