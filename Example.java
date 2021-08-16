class Baz {
    static int haveSideEffect() {
        System.out.println("interface Foo initialized");
        return 0;
    }
}

public class Example {
    public static void main(String[] args) {
        int dummy = Baz.haveSideEffect();

        System.out.println("Message from main " + dummy);
    }
}
