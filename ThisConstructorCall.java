class SuperAndThis {
    SuperAndThis() {
        System.out.println("Welcome from parent class");
    }

    SuperAndThis(String msg) {
        System.out.print("Parameterized constructor of parent: ");
        System.out.println(msg.length());
    }
}

class ThisConstructorCall extends SuperAndThis {
    ThisConstructorCall() {
        super();
        System.out.println("Welcome from non-parameterized constructor");
    }

    ThisConstructorCall(String msg) {
        this();
        System.out.println("Parameterized constructor: " + msg);
    }

    ThisConstructorCall(String msg1, String msg2) {
        this(msg1);
        System.out.println("Parameterized constructor 2: " + msg2);
    }

    public static void main(String[] args) {
        ThisConstructorCall obj = new ThisConstructorCall("Akash", "Das");
    }
}
