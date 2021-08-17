interface MyInterface {
    void interfaceFun();
}

abstract class MyAbstractClass {
    abstract void abstractFun();

    void printMessage() {
        System.out.println("I am inherited from My Abstract Class");
    }
}

class NormalClass {
    void normalFun() {
        System.out.println("I am inherited from Normal Class");
    }

    void printMessage() {
        System.out.println("I am inherited from Normal Class");
    }
}

class ImplementingInterface implements MyInterface {
    public void interfaceFun() {
        System.out.println("Concrete implementation for interface method via implementing the interface");
    }
}

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        MyInterface obj = new ImplementingInterface();
        obj.interfaceFun();

        MyInterface obj2 = new MyInterface() {
            @Override
            public void interfaceFun() {
                System.out.println("Concrete implementation for interface method through anonymous inner class");
                ownMethod();
            }

            private static void ownMethod() {
                System.out.println("A message from anon class's own method");
            }
        }; // Syntactical Sugar
        obj2.interfaceFun();

        System.out.println();
        MyAbstractClass obj3 = new MyAbstractClass() {
            @Override
            public void abstractFun() {
                System.out.println("Concrete implementation for abstract class method through anonymous inner class");
                ownMethod();
            }

            private static void ownMethod() {
                System.out.println("A message from anon class's own method");
            }
        }; // Syntactical Sugar
        obj3.abstractFun();
        obj3.printMessage();

        System.out.println();
        NormalClass obj4 = new NormalClass() {
            @Override
            void normalFun() {
                System.out.println("Overridden implementation by anon class");
            }
        };
        obj4.normalFun();
        obj4.printMessage();
    }
}
