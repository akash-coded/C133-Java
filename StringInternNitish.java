public class StringInternNitish {
    public static void main(String args[]) {

        String str0 = new String("hlo");
        String str1 = "hlo";
        String str2 = "hlo";
        String str4 = str0.intern();
        System.out.println(str0 == str4); // false
        System.out.println(Integer.toHexString(str4.hashCode()));
        System.out.println(Integer.toHexString(str0.hashCode()));
    }
}