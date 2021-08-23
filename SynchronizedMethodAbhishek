package MutliThreading;

class Warehouse {
    static int items = 4;

    private int increment(int x) {
        System.out.println("Incremented to=>" + (items + x));
        items += x;
        return items;
    }

    private int decrement(int x) {
        if (items >= x) {
            System.out.println("Decremented to=>" + (items - x));
            items -= x;
            return items;
        }
        return 0;
    }

    private void display() {
        System.out.println("Total items in warehouse =>" + items);
    }

    synchronized void change(int x,int y) {
        this.increment(x);
        this.decrement(y);
        this.display();

    }

}

class Thread5 extends Thread {
    Warehouse warehouse;

    public Thread5(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.change(5,3);
    }
}

class Thread6 extends Thread {
    Warehouse warehouse;

    public Thread6(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    synchronized public void run() {
        warehouse.change(2,4);
    }
}

public class SynchronizedMethod2 {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();
        Thread5 thread5 = new Thread5(warehouse);
        Thread6 thread6 = new Thread6(warehouse);

        thread5.start();
        thread6.start();
        thread6.join();
        System.out.println("Finally we have " + Warehouse.items + " items in the warehouse");
    }
}
