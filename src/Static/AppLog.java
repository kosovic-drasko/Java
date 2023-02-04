package Static;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AppLog {
private PrintWriter pw;

private void openLogFile() throws FileNotFoundException {
    if(pw==null){
        FileOutputStream fos=new FileOutputStream("app.log",true);
        pw=new PrintWriter(fos);
    }

}
private void closeLogFile(){
    if(pw!=null){
        pw.close();
    }
}
    public void write(int errorCode,String errorMessage) throws FileNotFoundException {
        String record =System.currentTimeMillis()+"\t"+
            String.format("%010d",errorCode)+errorMessage;
openLogFile();
pw.println(record);
pw.flush();
        closeLogFile();
    }
}
