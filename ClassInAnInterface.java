interface OuterInterface {
    int num = 10;

    void interfaceFun();

    class NestedClass {
        static int x = 10;
        private int y = 20;

        public void classNonStaticFun() {
            System.out.print("Instance Method of Nested Class:: ");
            System.out.println(x + " " + y + " ");
            System.out.println(num);
        }

        public static void classStaticFun() {
            System.out.print("Static Method of Nested Class:: ");
            System.out.println(x + " ");
            System.out.println(num);
        }
    }
}

public class ClassInAnInterface {
    public static void main(String[] args) {
        OuterInterface.NestedClass obj = new OuterInterface.NestedClass();
        obj.classNonStaticFun();
        obj.classStaticFun();
        OuterInterface.NestedClass.classStaticFun();
    }
}
