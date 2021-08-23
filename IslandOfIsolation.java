public class IslandOfIsolation {
    IslandOfIsolation i;

    public static void main(String[] args) {
        IslandOfIsolation obj1 = new IslandOfIsolation();
        IslandOfIsolation obj2 = new IslandOfIsolation();

        obj1.i = obj2;
        obj2.i = obj1;

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Main completed");
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalize method invoked");
    }
}
