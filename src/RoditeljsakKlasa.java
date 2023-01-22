public class RoditeljsakKlasa {

    private Number visina;
    private final Number sirina=40;
    private String ime;

    public RoditeljsakKlasa() {
    }

    //    public RoditeljsakKlasa(Number visina, Number sirina, String ime) {
//        this.visina = visina;
//        this.sirina = sirina;
//        this.ime = ime;
//    }

    public Number getVisina() {
        return visina;
    }

    public void setVisina(Number visina) {
        this.visina = visina;
    }

    public Number getSirina() {
        return sirina;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Number  Povrsina(){
        return this.sirina ;
    }

    @Override
    public String toString() {
        return "RoditeljsakKlasa{" +
                "visina=" + visina +
                ", sirina=" + sirina +
                ", ime='" + ime + '\'' +
                '}';
    }
}
