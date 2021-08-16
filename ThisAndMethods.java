class TestMethodsWithThis {
    private void foo(TestMethodsWithThis obj) {
        System.out.print("Method invoked: ");
        System.out.println(obj);
    }

    void bar() {
        foo(this);
    }

    TestMethodsWithThis baz() {
        return this;
    }
}

public class ThisAndMethods {
    public static void main(String[] args) {
        TestMethodsWithThis obj = new TestMethodsWithThis();
        TestMethodsWithThis obj2 = new TestMethodsWithThis();
        obj.bar();
        System.out.println(obj.baz());
        System.out.println(obj2.baz());
    }
}
