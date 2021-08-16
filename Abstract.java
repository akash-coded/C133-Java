abstract class Bike {
    int speedLimit = 80;

    Bike() {

    }

    Bike(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    abstract void ride();

    void displaySpeedLimit() {
        System.out.println("Speed limit is " + speedLimit + " km/hr");
    }
}

class Honda extends Bike {
    Honda() {
        super(100);
    }

    void ride() {
        System.out.println("Rides good");
    }

    void show() {
        System.out.println(speedLimit);
    }
}

class Hero extends Bike {
    @Override
    void ride() {
        System.out.println("Rides great");
    }

    public static void main(String[] args) {
        Bike b = new Honda();
        b.ride();
        b.displaySpeedLimit();
        // b.show();
    }
}
