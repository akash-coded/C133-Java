import java.util.Scanner;

class MyThread1 extends Thread {
    @Override
    public void run() {
        // System.out.println("MyThread1 run() function");

        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt(); // Blocking I/O operation

        for (int i = 0; i < 1; i++) {
            System.out.println("MyThread1 run() function");
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 3; i++) {
            System.out.println("MyThread2 run() function");
        }
        Thread.currentThread().setPriority(2);
        System.out.println("MyThread2 run() function");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1(); // Newborn state
        t1.setPriority(2);
        t1.start(); // Ready state

        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt(); // Blocking I/O operation

        MyThread2 t = new MyThread2();
        Thread t2 = new Thread(t); // Newborn state
        t2.setPriority(8);
        t2.start(); // Ready state

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setName("Thread of MyThread1");
        t2.setName("Thread of MyThread2");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread().getName());

        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(Thread.currentThread().getId());

        // try {
        // Thread.sleep(10);
        // t1.join();
        // t2.join(1000);
        // } catch (InterruptedException e) {
        // System.out.println(e);
        // }

        System.out.println("Main function terminating"); // Blocking I/O operation
    }
}
