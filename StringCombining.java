public class StringCombining {
    public static void main(String[] args) {
        String str1 = new String("Wiley");
        StringBuffer str2 = new StringBuffer("Google");

        System.out.println(str1.hashCode());
        str1 = str1.concat(" Pvt. Ltd.");
        System.out.println(str1.hashCode());

        str2.append(" Ltd.");

        System.out.println(str1);
        System.out.println(str2);
    }
}