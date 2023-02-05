package wrapper;

public class Put {
    private double metar;

   private Put(double metar) {
        this.metar = metar;
    }
   public static Put fromMeters(double metar) {
       return new Put(metar);
   }
}
