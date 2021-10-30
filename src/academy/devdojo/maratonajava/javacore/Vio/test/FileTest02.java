package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);

        File fileArquiveDirectory = new File(fileDirectory, "arquivo.txt");
        boolean isFileCreated = fileArquiveDirectory.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquiveDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File fileDirectoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(fileDirectoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}
