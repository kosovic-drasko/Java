package wrapper;

public class Put {
    private double metar;

   private Put(double metar) {
        this.metar = metar;
    }
   public static Put fromMeters(double metar) {
       return new Put(metar);
   }
    public static Put fromKilometars(double metar) {
        return new Put(metar*1000);
    }
    public double toMeters(double metar){
       return this.metar=metar;
    }
    public double toKilometers(double metar){
        return this.metar=metar/1000;
    }

    public void addMeters(double metar){
       this.metar+=metar;
    }

    public void addKilometers(double kilometri){
        this.metar+=kilometri*1000;
    }
}
