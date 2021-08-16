public class InterfaceSideEffects {
    public static void main(String[] args) {
        System.out.println("InterfaceSideEffects.main()");
        Impl i = new Impl();
        System.out.println("Impl initialized");
        i.bla();
        System.out.println("Impl instance method invoked");
        Foo f = new Impl();
        System.out.println("Impl initialized and assigned to Foo");
        f.bla();
        System.out.println("Foo interface method invoked");
    }
}

interface Foo {
    int dummy = Bar.haveSideEffect();

    void bla();
}

class Bar {
    static int haveSideEffect() {
        System.out.println("interface Foo initialized");
        return 0;
    }
}

class Impl implements Foo {
    public void bla() {
    }
}
