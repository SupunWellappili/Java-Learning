package Controller.For;
public class Demo07 {
    public static void main(String[] args) {
        for (byte y = 0; y < 100; y++) {
            System.out.println((y + 1) + " Count");
        }

        System.out.println("----------------");

        int i = 0;
        for (; i < 10; ) {
            System.out.println("XYZ");
            i++;
        }

        System.out.println("----------------");

        int j = 0;
        for (; ; ) {
            System.out.println("ABC");
            j++;
        }
    }
}
