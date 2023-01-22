package Nasledjivanje;

public class SubKlasaNastavnik extends SuperKlasaOsoba {

    private Double plata;
    private String predmet;

    public Double getPlata() {
        return plata;
    }

    public void setPlata(Double plata) {
        this.plata = plata;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
