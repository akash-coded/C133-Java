import java.io.IOException;

class Container {
    void fun() throws ArithmeticException, ArrayIndexOutOfBoundsException, IOException {
        int[] arr = { 10 };
        System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
    }

    void caller() throws Exception, ArithmeticException, ArrayIndexOutOfBoundsException, IOException {
        try {
            // try {
            // throw new ArithmeticException();
            // } catch (ArithmeticException e) {
            // throw e;
            // }
            fun();
            System.out.println("End of try block"); // Not printed
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.print("Inside catch of caller(): ");
            System.out.println(e);
            throw e; // Gets substituted by the throw in finally
        }
    }
}

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        Container c = new Container();
        try {
            c.caller();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Inside main(): ");
            System.out.println("Fallback logic for array index out of bounds" + e);
        } catch (ArithmeticException e) {
            System.out.print("Inside main(): ");
            System.out.println("Fallback logic for arithmetic exception" + e);
        } catch (NullPointerException e) {
            System.out.print("Inside main(): ");
            System.out.println("Fallback logic for null pointer exception" + e);
        } catch (Exception e) {
            System.out.print("Inside main(): ");
            System.out.println("Fallback logic for exception" + e);
        }
        System.out.println("End of main");
    }
}
