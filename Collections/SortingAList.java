package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book2 implements Comparable<Book2> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book2(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book2 b) {
        if (this.id < b.id) { // descending order
            return 1;
        } else if (this.id > b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class ImplComparator2 implements Comparator<Book2> {
    public int compare(Book2 b1, Book2 b2) {
        if (b1.quantity > b2.quantity) { // ascending order
            return 1;
        } else if (b1.quantity < b2.quantity) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class SortingAList {
    public static void main(String[] args) {
        // Creating Books
        Book2 b1 = new Book2(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book2 b2 = new Book2(233, "Operating System", "Galvin", "Wiley", 6);
        Book2 b3 = new Book2(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        List<Book2> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        System.out.println("Before sorting:: ");
        bookList.forEach(
                b -> System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity));

        Collections.sort(bookList, new ImplComparator2());
        System.out.println("After sorting:: ");
        bookList.forEach(
                b -> System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity));
    }
}
