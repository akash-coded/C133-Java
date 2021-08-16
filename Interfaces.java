interface Vehicle {
    void start();

    void stop();

    int getNoOfWheels();

    default void displaySpeed() {
        System.out.println(getSpeed());
    }

    static void displayMessage(String msg) {
        System.out.println("Message from static function" + msg);
    }

    private String getSpeed() {
        return "new message 2";
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public int getNoOfWheels() {
        return 4;
    }

    void performWheelie() {
        System.out.println("Wheelies are dangerous");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }

    public int getNoOfWheels() {
        return 2;
    }
}

class Interfaces {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();
        System.out.println(c.getNoOfWheels());
        c.displaySpeed();
        c.stop();
    }
}
