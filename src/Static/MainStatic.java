package Static;

import java.io.FileNotFoundException;

public class MainStatic {
    public static void main(String[] args) throws FileNotFoundException {

        AppLog al1 = new AppLog();
        al1.write(3401, "Greska povezivanja");

        AppLog al2 = new AppLog();
        al2.write(5000, "Greska 5000");
    }
}
