package Method_Declaration;

public class Demo06 {
    public static void main(String[] args) {
        getting(100);

        byte a = 13;
        short b = 34;
        int c = 332;
        double d = 56.4;
        long e = 45343;
        float f = 45.43f;
        char ch = 'A';

        getting(a);
        getting(b);
        getting(c);
        getting(d);
        getting(e);
        getting(f);
        getting(ch);
    }

    public static void getting(int x) {
        System.out.println("[" + x + "]");
    }

    public static void getting(double x) {
        System.out.println("[" + x + "]");
    }
}
