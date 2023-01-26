package Nasledjivanje;

public class SubKlasaUcenik {

    private Integer razred;
    private  Integer ocjene;

    public Integer getRazred() {
        return razred;
    }

    public void setRazred(Integer razred) {
        this.razred = razred;
    }

    public Integer getOcjene() {
        return ocjene;
    }

    public void setOcjene(Integer ocjene) {
        this.ocjene = ocjene;
    }

    @Override
    public String toString() {
        return "SubKlasaUcenik{" +
                "razred=" + razred +
                ", ocjene=" + ocjene +
                '}';
    }
        public SubKlasaUcenik(Integer razred, Integer ocjene) {
        this.razred = razred;
        this.ocjene = ocjene;
    }

    // Sa konstuktorom punim

//    public Integer getRazred() {
//        return razred;
//    }
//
//    public void setRazred(Integer razred) {
//        this.razred = razred;
//    }
//
//    public Integer getOcjene() {
//        return ocjene;
//    }
//
//    public void setOcjene(Integer ocjene) {
//        this.ocjene = ocjene;
//    }
}
