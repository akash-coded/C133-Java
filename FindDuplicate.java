public class FindDuplicate {
    static void findDuplicateNumber(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int j = Math.abs(num[i] - 1);

            if (num[j] > 0) {
                num[j] = -num[j];
            } else {
                System.out.print(j - 1 + " ");
            }
        }
    }

    static void findDuplicateNumber2(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[num[i] % num.length] = num[num[i] % num.length] + num.length;
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 2 * num.length) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 0, 0, 4, 1 };
        // for (int i = 0; i < numbers.length; i++) {
        // numbers[i] += 1;
        // }
        System.out.println("The duplicate numbers are::");
        findDuplicateNumber2(numbers);
    }
}