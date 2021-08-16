class TryFinallyWithReturn {
    static int demo() {
        try {
            System.out.println("Inside try");
            return 3;
        } catch (Exception e) {
            System.out.println("Inside catch" + e);
        } finally {
            System.out.println("Inside finally");
            // return 5;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(demo());
    }
}