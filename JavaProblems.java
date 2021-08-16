import java.util.Scanner;

public class JavaProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += scanner.nextInt();
        }

        System.out.println((9 * 10 / 2) - sum);

        scanner.close();
    }
}
