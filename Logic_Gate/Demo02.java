package Logic_Gate;

public class Demo02 {
    public static void main(String[] args) {
        int x = 3, y = 4, z = 5;
        System.out.println("01) "+ x + " " + y + " " + z);
        if (x++ == 3 && y++ == 4 && z++ == 5) {
            System.out.println("02) " + x + " " + y + " " + z);
        }
        int p = 3, q = 4, r = 5;
        System.out.println("03) " + p + " " + q + " " + r);
        if (p++ == 1 && q++ == 5 && r++ == 5) {
            System.out.println("04) " + p + " " + q + " " + r);
        }

        System.out.println("05) " + p + " " + q + " " + r);
    }
}
