class Warehouse {
    int items = 4;

    synchronized int increment(int x) {
        System.out.println("Incremented to=>" + (items + x));
        items += x;
        return decrement(1);
    }

    synchronized int decrement(int x) {
        if (items >= x) {
            System.out.println("Decremented to=>" + (items - x));
            items -= x;
            return items;
        }
        return 0;
    }

    void display() {
        System.out.println("Total items in warehouse =>" + items);
    }

}

class Thread5 extends Thread {
    Warehouse warehouse;

    public Thread5(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.increment(3);
    }
}

class Thread6 extends Thread {
    Warehouse warehouse;

    public Thread6(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.decrement(2);
    }
}

public class ReentrantMonitors {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();
        Thread5 thread5 = new Thread5(warehouse);
        Thread6 thread6 = new Thread6(warehouse);

        thread5.start();
        thread6.start();
        thread5.join();
        thread6.join();
        warehouse.display();
    }
}
