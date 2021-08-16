abstract class ParentAbstract {
    static final int x;
    public static int parentInt = 80713;
    static {
        x = 5;
        System.out.println("Parent static block executed"); // 1
        parentInt = 9;
    }

    ParentAbstract() {
        System.out.println("Parent constructor"); // 3
    }

    public void methodInParent() {
        System.out.println("MethodInParent called"); // 5
    }

}

class ChildExtending extends ParentAbstract {
    static final int x;
    public int childInt = 111213;
    static {
        x = 10;
        System.out.println("Child static block executed"); // 2
    }

    public ChildExtending() {
        System.out.println("Child constructor"); // 4
    }

    public void methodInChild() {
        System.out.println("MethodInChild called");
        System.out.println(x);

    }
}

public class StaticBlockAndAbstractClasses {
    public static void main(String[] args) {
        ParentAbstract ce = new ChildExtending();
        ce.methodInParent();
        ((ChildExtending) ce).methodInChild();
    }
}