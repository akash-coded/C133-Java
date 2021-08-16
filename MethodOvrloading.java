class MethodOverload {
    // Method Overloading via fun()
    void fun() { // Function 1
        System.out.println("I am a function with no args");
    }

    void fun(String arg) { // Function 2
        System.out.println("I am a function with args: " + arg);
    }

    void fun(int arg) { // Function 3
        System.out.println("I am a function with args: " + arg);
    }

    void fun(int arg1, String arg2) { // Function 4
        System.out.println("I am a function with args: " + arg1 + " " + arg2);
    }

    void fun(String arg1, int arg2) { // Function 5
        System.out.println("I am a function with args: " + arg1 + " " + arg2);
    }

    void fun(int x, double... y) { // Function 6
        System.out.print("I am an overloaded function with varargs... " + x);
        for (double d : y) {
            System.out.print(" " + d);
        }
    }

    // void fun(int arg1, double arg2) { // Function 7
    // System.out.println("I am a function with args: " + arg1 + " " + arg2);
    // }

    // public void fun(String arg) { // Function 2
    // System.out.println("I am a function with args: " + arg);
    // }

    // int fun(int arg) { // Function 6
    // System.out.println("I am a function with args: " + arg);
    // return 100;
    // }
}

class MethodOverloadWentWrong {
    void fun(int x, double y) {
        System.out.println("Int first, Double second" + x + " " + y);
    }

    void fun(double x, int y) {
        System.out.println("Double first, Int second" + x + " " + y);
    }
}

public class MethodOvrloading {
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

        obj.fun();

        obj.fun("Wiley");

        obj.fun(20);

        obj.fun(20, "Wiley");

        obj.fun("Wiley", 20);

        byte b = 20, c = 30;

        obj.fun(b);

        obj.fun(b, 20.0, 30);

        // MethodOverloadWentWrong obj = new MethodOverloadWentWrong();
        // obj.fun(20, 20.0);
    }
}
