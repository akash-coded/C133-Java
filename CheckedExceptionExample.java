public class CheckedExceptionExample {
    public static void main(String[] args) {
        // int x = 5 / 0; // Uncaught unchecked exception
        try {
            throw new java.io.IOException("Keyboard not found"); // checked exception
        } catch (java.io.IOException e) {
            System.out.println("Checked exception handled");
        }

    }
}
