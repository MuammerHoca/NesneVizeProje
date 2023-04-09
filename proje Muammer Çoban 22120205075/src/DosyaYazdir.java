import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class DosyaYazdir {

    public void dosyaolustur (File f,String str) throws IOException {

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }



        }

        FileWriter fileWriter = new FileWriter(f, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
        //FileWriter fileWriter1=fw;



    }

     public void dosyaYaz(File f,String str) throws IOException {
        FileWriter fileWriter = new FileWriter(f, false);
         BufferedWriter bWriter = new BufferedWriter(fileWriter);
         bWriter.write(str);
         bWriter.close();
    }


    public void veriYaz(FileWriter fw,String str){
        BufferedWriter bWriter = new BufferedWriter(fw);

    }



}
