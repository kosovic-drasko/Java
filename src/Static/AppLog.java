package Static;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AppLog {
    private static PrintWriter pw;

    private void openLogFile() throws FileNotFoundException {
        if (pw == null) {
            System.out.println("Otvaram dnevnik");
            FileOutputStream fos = new FileOutputStream("app.log", true);
            pw = new PrintWriter(fos);
        }

    }

    private void closeLogFile() {

        if (pw != null) {
            System.out.println("Zarvaram dnevnik");
            pw.close();
        }
    }

    public void write(int errorCode, String errorMessage) throws FileNotFoundException {
        String record = System.currentTimeMillis() + "\t" +
                String.format("%010d", errorCode) + errorMessage;
        openLogFile();
        System.out.println("Upisujem u dnevnik");
        pw.println(record);
        pw.flush();
//        closeLogFile();
    }
}
