class Customer {
    private int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        while (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notifyAll();
    }
}

class TestThreadCooperation {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start(); // Thread-1

        new Thread() {
            public void run() {
                c.withdraw(11000);
            }
        }.start(); // Thread-1

        new Thread() {
            public void run() {
                c.withdraw(10000);
            }
        }.start(); // Thread-1

        new Thread() {
            public void run() {
                c.deposit(1000);
            }
        }.start(); // Thread-2
    }
}
