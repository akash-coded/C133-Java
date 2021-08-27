package Serialization;

import java.io.*;

class StudentSeriliazation {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("Serialization/f.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            Student s1 = new Student(21, "Akash");
            // Write the object into the file
            out.writeObject(s1);
            // Flush the output stream pipe
            out.flush();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}