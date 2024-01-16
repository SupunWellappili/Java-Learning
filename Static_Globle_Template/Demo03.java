package Static_Globle_Template;

public class Demo03 {
    static int y = 100;

    public static void increment(int x) {
        x++;
        y++;

    }

    public static void main(String[] args) {
        int x = 100;
        increment(x);
        increment(x);
        increment(x);

        System.out.println(x);
        System.out.println(y);


    }
}
