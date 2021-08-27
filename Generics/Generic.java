package Generics;

import java.util.ArrayList;

class RegularClass {
    int member;

    RegularClass(int member) {
        this.member = member;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    <T> void displayType(T param) {
        System.out.println("Generic function");
        System.out.println(param.getClass().getName());
    }
}

class RegularChildClass extends RegularClass {
    RegularChildClass() {
        super(100);
    }
}

class GenericClass<T, U> {
    private T member;

    GenericClass(T member) {
        this.member = member;
    }

    public T getMember() {
        return member;
    }

    public void setMember(T member) {
        this.member = member;
    }

    void displayType() {
        System.out.println(member.getClass().getName());
    }

    <U> void displayType2(Integer param1, Double param2) {
        System.out.println("Generic function");
        System.out.println(param1.getClass().getName());
        System.out.println(param2.getClass().getName());
        System.out.println(member.getClass().getName());
    }

    void printAll(Arraylist<? super T> arr) {
        System.out.println("I work with arraylists");
    }
}

public class Generic {
    public static void main(String[] args) {
        RegularClass regular = new RegularClass(5);
        RegularChildClass child = new RegularChildClass();

        regular.displayType(10);

        GenericClass<Integer, String> generic = new GenericClass<>(5);
        generic.displayType2(20, 20.2);

        // GenericClass<RegularChildClass> generic2 = new GenericClass<>(child);
        // generic2.displayType();
    }
}
