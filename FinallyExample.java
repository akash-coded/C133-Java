public class FinallyExample {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        try {
            System.out.println("Before exception");
            System.out.println(a[4]);
            System.out.println("After exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught and handled");
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Normal execution");
        try {
            System.out.println("Before exception in 2nd try block");
            System.out.println(a[1] / 0);
            System.out.println("After exception in 2nd try block");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught and handled in 2nd catch block");
        } finally {
            System.out.println("Inside 2nd finally block");
        }
        System.out.println("Normal execution after 2nd try-catch-finally");
    }
}
