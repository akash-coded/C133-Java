package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        Collection<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println("Displaying the arraylist for the 1st time:: ");
        myList.forEach(System.out::println);

        Collection<String> myCollection = Arrays.asList("a", "b", "c");
        Stream<String> myStream = myCollection.stream();

        System.out.println("Displaying the stream of strings for the 1st time:: ");
        myStream.forEach(System.out::println);

        System.out.println("Displaying the arraylist for the 2nd time:: ");
        myList.forEach(System.out::println);

        try {
            System.out.println("Displaying the stream of strings for the 2nd time:: ");
            myStream.forEach(System.out::println);
        } catch (IllegalStateException e) {
            System.out.println("Can't reuse a stream");
        }

        System.out.println("Using the elements of a stream with forEach() method:: ");
        Stream<String> myStream2 = myCollection.stream();
        myStream2.forEach(ele -> System.out.println(ele));

        System.out.println("Using the elements of a stream with collect() method:: ");
        Stream<String> myStream3 = myCollection.stream();
        System.out.println(myStream3.collect(Collectors.toList()));

        Stream<String> myStream4 = myCollection.stream();
        long count = myStream4.peek(ele -> System.out.println(ele)).count();
        System.out.println(count + " elements have been streamed.");
    }
}
