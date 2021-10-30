package academy.devdojo.maratonajava.javacore.Vio.test;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("arquivos\\file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Wabba Lubba Dub Dub");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
