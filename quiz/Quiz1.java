package quiz;

public class Quiz1 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("ab10"));
    }

}

// 1. public class LineUp {
// 2. public static void main(String[] args) {
// 3. double d = 12.345;
// 4. // insert code here
// 5. }
// 6. }

// Expected Output: | 12.345|

// Options
// A. System.out.printf("|%7d| \n", d);
// B. System.out.printf("|%7f| \n", d);
// C. System.out.printf("|%3.7d| \n", d);
// D.System.out.printf("|%3.7f| \n",d);
// E. System.out.printf("|%7.3d| \n", d);
// F. System.out.printf("|%7.3f| \n", d);

// public class Test {
// public static void main(String [] args) {
// int x = 5;
// boolean b1 = true;
// boolean b2 = false;

// if ((x == 4) && !b2 )
// System.out.print("1 ");

// System.out.print("2 ");

// if ((b2 = true) && b1 )
// System.out.print("3 ");
// }
// }

// A. 2
// B. 3
// C. 1 2
// D. 2 3
// E. 1 2 3
// F. Compilation fails.
// G. An exception is thrown at runtime.

// interface Foo {}
// class Alpha implements Foo {}
// class Beta extends Alpha {}

// class Delta extends Beta {
// public static void main(String[] args) {
// Beta x = new Beta();
// //insert code here 16
// }
// }

// Which code, inserted at line 16, will cause a java.lang.ClassCastException?

// A.Alpha a = x;
// B.Foo f = (Delta) x;
// C.Foo f = (Alpha) x;
// D.Beta b = (Beta)(Alpha)x;

// public void go() {
// String o = "";
// z: for (int x = 0; x < 3; x++) {
// for (int y = 0; y < 2; y++) {
// if (x == 1)
// break;
// if (x == 2 && y == 1)
// break z;
// o = o + x + y;
// }
// }
// System.out.println(o);
// }

// What is
// the result
// when the

// go() method is invoked?

// A. 00
// B. 0001
// C. 000120
// D. 00012021
// E. Compilation fails.
// F. An exception is thrown at runtime.

// try {
// //some code here line 108
// } catch (NullPointerException e1) {
// System.out.print("a");
// } catch (Exception e2) {
// System.out.print("b");
// }finally {
// System.out.print("c");
// }

// If some sort of exception is thrown at line 108, which output is possible?

// A. a
// B. b
// C. c
// D. ac
// E. abc

// public class Boxer1 {
// Integer i;
// int x;

// public Boxer1(int y) {
// x = i + y;
// System.out.println(x);
// }

// public static void main(String[] args) {
// new Boxer1(new Integer(4));
// }
// }

// What is the result?

// public static int sum(List list) {
// int sum = 0;
// for ( Iterator iter = list.iterator(); iter.hasNext(); ) {
// int i = ((Integer)iter.next()).intValue();
// sum += i;
// }
// return sum;
// }

// What three changes allow the class to be used with generics
// and avoid an unchecked warning? (Choose three.)

// A. Remove line 133.
// B. Replace line 133 with "int i = iter.next();".
// C. Replace line 132 with "for (int i : intList) {".
// D. Replace line 132 with "for (Iterator iter : intList) {".
// E. Replace the method declaration with "sum(List<int> intList)".
// F. Replace the method declaration with "sum(List<Integer> intList)".
