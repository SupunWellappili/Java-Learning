package Method;

public class Demo09 {
    public static void printTotal(int a, int b) {
        int tot = a + b;
        System.out.println(a + " + " + b + " = " + tot);
    }

    public static void printTotal(int a, int b, int c) {
        int tot = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + tot);
    }

    public static void main(String[] args) {
        printTotal(10, 20);
        printTotal(10, 20, 30);
    }
}

//Method over loading solution akak thamai var args/variable length argument


