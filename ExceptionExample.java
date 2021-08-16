public class ExceptionExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c;

        System.out.println("Before exception");
        c = a - b;
        try {
            System.out.println("Inside outer try block");
            try {
                System.out.println("Inside inner try block");
                System.out.println(5 / c);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in inner catch block");
            }
            System.out.println("End of outer try block");
        } catch (Exception e) {
            System.out.println("Exception caught in outer catch block");
        }
        System.out.println("After exception normal execution continues");
    }
}
