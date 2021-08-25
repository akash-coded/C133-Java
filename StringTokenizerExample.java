import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("Akash,Kumar Das", " ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
