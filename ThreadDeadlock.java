public class ThreadDeadlock {

    static boolean flag1 = false;
    static boolean flag2 = false;

    public static void main(String[] args) {
        final String resource1 = "ratan tata";
        final String resource2 = "mukesh ambani";

        // t1 tries to lock resource1 then resource2
        Runnable t = () -> {
            synchronized (resource1) {
                ThreadDeadlock.flag1 = true;
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                ThreadDeadlock.flag1 = false;
                resource1.notify();
            }

            try {
                while (ThreadDeadlock.flag2) {
                    resource2.wait();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (resource2) {
                ThreadDeadlock.flag2 = true;
                System.out.println("Thread 1: locked resource 2");
                ThreadDeadlock.flag2 = false;
                resource2.notify();
            }
        };
        Thread t1 = new Thread(t);

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    ThreadDeadlock.flag2 = true;
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    ThreadDeadlock.flag2 = false;
                    resource2.notify();
                }

                try {
                    while (ThreadDeadlock.flag1) {
                        resource1.wait();
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    ThreadDeadlock.flag1 = true;
                    System.out.println("Thread 2: locked resource 1");
                    ThreadDeadlock.flag1 = false;
                    resource1.notify();
                }
            }
        };

        t1.start();
        t2.start();
    }
}