class OuterClass {
    static int x = 10;
    private int y = 20;

    class MemberInnerClass {
        static int memberInnerX = 100;
        int memberInnerY = 200;

        public void memberInnerFun() {
            System.out.print("Instance Method of Member Inner Class:: ");
            System.out.print(x + " " + y); // Can access all members of the outer class
            System.out.println(" " + memberInnerX + " " + memberInnerY);
        }
    }

    public void outerFun() {
        class LocalInnerClass {
            static int localInnerX = 100;
            int localInnerY = 200;

            public void localInnerFun() {
                System.out.print("Instance Method of Local Inner Class:: ");
                System.out.print(x + " " + y); // Can access all members of the outer class
                System.out.println(" " + localInnerX + " " + localInnerY); // After JDK-7
            }
        }

        class Inner2 extends LocalInnerClass {

        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.localInnerFun();

        MemberInnerClass memberInner = new MemberInnerClass();
        memberInner.memberInnerFun();

        System.out.print("Instance Method of Outer Class:: ");
        System.out.println(x + " " + y);
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerFun();

        OuterClass.MemberInnerClass memberInner = outer.new MemberInnerClass();
        memberInner.memberInnerFun();
    }
}
