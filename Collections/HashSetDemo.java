package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Akash");
        set.add("Bikash");
        set.add("Chopra");
        set.add("Daniel");
        set.add("Bikash");

        System.out.println("The full set is:: ");
        for (String ele : set) {
            System.out.println(ele);
        }

        set.remove("E");
        System.out.println("After removal, the set is:: ");
        for (String ele : set) {
            System.out.println(ele);
        }

        set.removeIf(str -> str.contains("Aka"));
        System.out.println("After removeIf, the set is:: ");
        for (String ele : set) {
            System.out.println(ele);
        }
    }
}
