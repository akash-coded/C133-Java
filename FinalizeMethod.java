class FinalizeMethod {
    public static void main(String[] args) throws Throwable {
        FinalizeMethod obj = new FinalizeMethod(); // 1st object
        obj = null;
        // obj.finalize(); // Uncaught checked exception
        // obj = new FinalizeMethod(); // 1st object becomes orphan and 2nd object is
        // created
        // try {
        // obj.finalize(); // Uncaught checked exception
        // } catch (Throwable e) {
        // e.printStackTrace();
        // }
        System.out.println(obj); // Print 2nd object details
        System.gc(); // Ignores all unhandled exceptions in finalize()
        System.out.println("Main completed");
        // obj = null; // 2nd object becomes orphan
    }

    void disp() {
        System.out.println("My message");
    }

    @Override
    protected void finalize() throws Throwable {
        // throw new java.io.IOException();
        // System.out.println(10 / 0); // ArithmeticException (unchecked)
        try {
            throw new java.io.IOException(); // IOException (checked)
            // System.out.println(10 / 0); // ArithmeticException (unchecked)
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace(); // Creates an uncaught exception (error)
        } finally {
            System.out.println("Finally inside finalize");
        }
        System.out.println("Finalize method of FinalizeMethod class invoked");
    }
}