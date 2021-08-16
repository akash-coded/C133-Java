package myPackage;

import otherPackage.NewClass;

public class Packages extends NewClass {

    static void exampleMethod() {
        System.out.println("I am static method");
    }

    public static void main(String[] args) {
        System.out.println("\nPackage: myPackage\nClass: Packages");
        exampleMethod();
        printMessage();
    }
}
