public class StringIntern {
    public static void main(String[] args) throws Throwable {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = "Java";
        String s4 = s2.intern(); // String s4 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s3 == s1);
        System.out.println(s4 == s2);
        System.out.println(s4.equals(s2));

        s2 = "C++";
        System.out.println(s2);
        s4 = "C++".intern(); // s4 = s2;
        System.out.println(s4);
        System.out.println(s4 == s2);

        String str = "null";
        if (str != null) {
            if (!str.isEmpty()) {
                System.out.println(str);
            } else {
                System.out.println("Invalid email");
            }
        } else {
            System.out.println("Please provide email address");
        }

        String s = String.format("|%10d|", 1234);
        System.out.println(s);

        byte[] b = s2.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
