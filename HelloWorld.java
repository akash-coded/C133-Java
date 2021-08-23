public class HelloWorld {
    protected int x;
    private int y;
    static int z;

    HelloWorld() {
        x = 10;
        y = 20;
        z = 30;
    }

    HelloWorld(int a, int y, int z) {
        x = a;
        this.y = y;
        this.z = z;
    }

    void show() {
        int x = 100;
        int a = 200;
        System.out.println(x + " " + y + " " + z);
        System.out.println(this.x + " " + y + " " + z);
        // System.out.println(this.a);
    }
}

class ABC {
    public static void main(String[] args) {
        HelloWorld world = new HelloWorld();
        world.show();
    }
}