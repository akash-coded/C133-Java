class PrintTable {
    private int x;

    PrintTable(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    synchronized void printTable(int n) {
        printTable2(n + 1);

        System.out.println("Table for " + n + ":: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    synchronized void printTable2(int n) {
        System.out.println("Table for " + n + ":: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    private PrintTable t;

    Thread1(PrintTable t) {
        this.t = t;
    }

    @Override
    public void run() {
        // System.out.println("Table of 5:: ");
        t.printTable(5); // 1 monitor
        // System.out.println("Thread 1 x:: " + t.getX());
    }
}

class Thread2 extends Thread {
    PrintTable t;

    Thread2(PrintTable t) {
        this.t = t;
    }

    @Override
    public void run() {
        // System.out.println("Table of 10:: ");
        t.printTable2(9); // 1 monitor
        t.printTable2(10); // 1 monitor
        // System.out.println("Thread 2 x:: " + t.getX());
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        PrintTable t = new PrintTable(10);
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);

        long startTime = System.nanoTime();
        t1.start();
        t2.start();
        // Thread.sleep(10000);
        // t2.t = new PrintTable(20);
        // t1.join();
        // t2.join();
        // long endTime = System.nanoTime();
        // long timeElapsed = endTime - startTime;
        // System.out.println("Execution time in nanoseconds: " + timeElapsed);
        // System.out.println("Execution time in milliseconds: " + timeElapsed /
        // 1000000);
    }
}
