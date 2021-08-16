class A {

}

class B extends A {

}

class C extends B {

}

public class InheritanceProblem {
    static void fun(A a) {
        System.out.println("first");
    }

    static void fun(B b) {
        System.out.println("second");
    }

    static void fun(Object obj) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        C c = new C();
        fun(c);
    }
}
