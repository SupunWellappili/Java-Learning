package Variable;

public class Demo09 {
    public static void main(String[] args) {
        final int x;
        x = 120;//Dynamic Value
        System.out.println(x);
        int y;

        if (x > 0) {
            y = 600;
            System.out.println(y);
        }

        System.out.println(x);
       // System.out.println(y);//Illegal

    }
}
