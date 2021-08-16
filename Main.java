import java.util.Arrays;

public class Main {
    static String[] argv;

    Main(String[] abc) {
        argv = abc;
    }

    // Utility function
    public static void main() {
        System.out.println("Fake main");
        System.out.println(Arrays.toString(argv));
    }

    // Driver function
    public static void main(String... args) {
        System.out.println("And.I.am.main");
        // main(new String[] { "" });

        Main obj = new Main(new String[] { "a", "b", "c", "d" });
        Main.main();
    }
}
