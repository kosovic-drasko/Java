package Potrosnja;

public class MainPotrosnja {
    
    public static void main(String[] args) {

        PotrosnjaGoriva potrosnjaGoriva=new PotrosnjaGoriva();
        potrosnjaGoriva.punjenje(10);
        potrosnjaGoriva.predjeno(100);
        System.out.println("Sada u rezervoar ima:  "+potrosnjaGoriva.getRezervoar()+" litara"+"  i predjeno je: "+potrosnjaGoriva.getPredjeno_km()+" km");
        potrosnjaGoriva.punjenje(20);
        System.out.println("Novo punjenje"+potrosnjaGoriva.getRezervoar());
    }
}
