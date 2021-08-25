package fileHandling;

import java.io.File;
import java.io.IOException;

public class GetFileInfo {
    public static void main(String[] args) {
        File f = new File("fileHandling/Test.txt");

        if (f.exists()) {
            System.out.println(f.getName());

            System.out.println(f.getAbsolutePath());

            System.out.println(f.canRead());

            System.out.println(f.canWrite());

            System.out.println(f.canExecute());

            System.out.println(f.length());
        }
    }
}
