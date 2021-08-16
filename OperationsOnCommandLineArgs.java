enum Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}

class Operations {
    int a;
    int b;
    Operator opr;

    public Operations(int a, int b, Operator opr) {
        this.a = a;
        this.b = b;
        this.opr = opr;
    }

    public int calculate() {
        switch (opr) {
            case ADD -> {
                return (a + b);
            }
            case SUBTRACT -> {
                return (a - b);
            }
            case MULTIPLY -> {
                return (a * b);
            }
            case DIVIDE -> {
                return a / b;
            }
            default -> {
                return -1;
            }
        }
    }
}

public class OperationsOnCommandLineArgs {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Operator opr = Operator.valueOf(args[2]);
        Operations c = new Operations(a, b, opr);
        System.out.println(c.calculate());
    }
}
