class OuterClass1 {
    static int x = 10;
    private int y = 20;

    static class StaticNestedClass {
        static int staticNestedX = 1000;
        int staticNestedY = 2000;

        void nonStaticFun() {
            System.out.print("Non-static method of static nested class:: ");
            System.out.print(x + " "); // Can only access static members of the outer class
            System.out.println(staticNestedX + " " + staticNestedY); // Can access both static and non-static members of
                                                                     // the outer class
        }

        static void staticFun() {
            System.out.print("Static method of static nested class:: ");
            System.out.print(x + " "); // Can only access static members of the outer class
            System.out.println(staticNestedX); // Can only access static members of the nested class
        }
    }

    public void outerFun() {
        System.out.print("Instance Method of Outer Class:: ");
        System.out.println(x + " " + y);
    }
}

public class StaticNestedClasses {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        outer.outerFun();

        // Accessing static fields of nested static class
        System.out.print("\nMain method:: ");
        System.out.println(OuterClass1.StaticNestedClass.staticNestedX);

        // Calling non-static function of nested static class
        System.out.println();
        OuterClass1.StaticNestedClass staticNested = new OuterClass1.StaticNestedClass();
        staticNested.nonStaticFun();

        // Calling static function of nested static class
        System.out.println();
        staticNested.staticFun();
        OuterClass1.StaticNestedClass.staticFun();
    }
}
