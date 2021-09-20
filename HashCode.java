public class HashCode {
    public static void main(String[] args) {
        HashCode obj1 = new HashCode();
        HashCode obj2 = new HashCode();
        HashCode obj3 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        Integer i = 5;
        System.out.println(i.hashCode());
        System.out.println(Integer.hashCode(5));
    }
}
