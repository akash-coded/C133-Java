class PrintTableSync {
    static void printTable(int n) {
        System.out.println("Random message from thread " + Thread.currentThread().getName());
        synchronized (PrintTableSync.class) {
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
}

class UserThread1 extends Thread {
    PrintTableSync t;

    UserThread1(PrintTableSync t) {
        this.t = t;
    }

    @Override
    public void run() {
        // System.out.println("Table of 5:: ");
        t.printTable(5);
    }
}

class UserThread2 extends Thread {
    PrintTableSync t;

    UserThread2(PrintTableSync t) {
        this.t = t;
    }

    @Override
    public void run() {
        // System.out.println("Table of 10:: ");
        t.printTable(10);
    }
}

class ThreadSync2 {
    public static void main(String[] args) throws InterruptedException {
        PrintTableSync table1 = new PrintTableSync();
        PrintTableSync table2 = new PrintTableSync();

        UserThread1 t1 = new UserThread1(table1);
        UserThread2 t2 = new UserThread2(table2);

        long startTime = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        // while (t1 != null) {
        // Thread.sleep(1000000000000L);
        // }
        t2.join();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
