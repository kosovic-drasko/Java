package Potrosnja;

public class PotrosnjaGoriva {

    private double rezervoar=0.0;
    private double predjeno_km=0.0;
    private final double prosjecnaPotrosnja=5;
    
    public double getRezervoar() {
        return rezervoar;
    }
    public void setRezervoar(double rezervoar) {
        this.rezervoar = rezervoar;
    }
    public double getPredjeno_km() {
        return predjeno_km;
    }
    public void setPredjeno_km(double predjeno_km) {
        this.predjeno_km = predjeno_km;
    }

    
public void punjenje(double kolicina){
    this.rezervoar+=kolicina;
}
 public void predjeno(double predjeno){
        this.predjeno_km+=predjeno;
    }

    public void potrosnjaNaPredjenuKm(){

    }
    
}
