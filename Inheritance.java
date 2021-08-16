class Grandparent {
    int a = 10;

    Grandparent() {

    }

    // Grandparent(String msg) {
    // System.out.println("This is the Grandparent class. " + msg);
    // }

    void run() {
        System.out.println("I am from the 60s");
    }
}

class Parent extends Grandparent {
    int b = 20;

    Parent() {

    }

    // Parent(double x, String msg) {
    // // super(msg);
    // System.out.println(x);
    // }

    @Override
    public void run() {
        System.out.println("I am from the 80s");
        // super.run();
    }

    void show() {
        System.out.println("I am from parent class");
    }
}

class Child extends Parent {
    int c = 30;

    Child() {

    }

    // Child(int x, double y, String z) {
    // super(y, z);
    // System.out.println(x);
    // }

    @Override
    public void run() {
        System.out.println("I am a millenial");
        // super.run();
    }

    // void show() {
    // System.out.println("I am from child class");
    // // super.show();
    // }

    void watch() {
        System.out.println("I belong to the digital era");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Grandparent g = new Grandparent();
        Parent p = new Child();

        p.run();
        p.show();
        // ((Child) p).watch();
    }
}
