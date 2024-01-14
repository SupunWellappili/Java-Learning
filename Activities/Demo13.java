package Activities;


public class Demo13 {

    public static boolean printNumber(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 3; i < 1000; i++) {
            if (printNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
