import java.util.Arrays;

public class ArrayDemo {
    static int[] arrCpy(int[] arr) {
        int[] intArr2 = arr.clone();

        return intArr2;
    }

    public static void main(String[] args) {
        int[] intArr1 = { 5, 7, 51, 2, 3, 0 };

        System.out.println("\nOriginal array is:");
        for (int i : intArr1) {
            System.out.print(i + " ");
        }

        int[] copiedArr = arrCpy(intArr1);

        System.out.println("\nCopied array is:");
        for (int i : copiedArr) {
            System.out.print(i + " ");
        }

        intArr1[2] = 8;
        System.out.println("\nAfter modification::");
        System.out.println("\nOriginal array is:");
        for (int i : intArr1) {
            System.out.print(i + " ");
        }

        System.out.println("\nCopied array is:");
        for (int i : copiedArr) {
            System.out.print(i + " ");
        }
    }

}
