package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("fileHandling/Test2.txt");
        if (f.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
