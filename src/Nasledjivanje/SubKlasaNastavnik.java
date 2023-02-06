package Nasledjivanje;

public class SubKlasaNastavnik extends SuperKlasaOsoba {



    private final Double plata=400.0;
    private String predmet;

    public SubKlasaNastavnik(String ime, String prezime, String predmet) {
        super(ime, prezime);
        this.predmet = predmet;
    }

    public SubKlasaNastavnik(String predmet) {
        this.predmet = predmet;
    }


    public Double getPlata() {
        return plata;
    }

//    public void setPlata(Double plata) {
//        this.plata = plata;
//    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }


    @Override
    public String toString() {
        return "SubKlasaNastavnik{" +
                 "ime=" + getIme()  +','+
                "  plata=" + plata +
                ", predmet='" + predmet + '\'' +
                '}';
    }
}
