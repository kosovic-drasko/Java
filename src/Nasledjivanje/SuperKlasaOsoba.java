package Nasledjivanje;

public class SuperKlasaOsoba {

private String ime;
private String prezime;

    public SuperKlasaOsoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public SuperKlasaOsoba() {

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "SuperKlasaOsoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
