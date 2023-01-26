package Interfejsi;

public class Skola implements ISkola{

    @Override
    public String print() {
        return "Moja skola";
    }

    @Override
    public void kozola() {
        System.out.println("Poruka void intefrace: ");
    }
}
