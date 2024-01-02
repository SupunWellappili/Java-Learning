package Activities;

public class Demo08 {

    public static double fact(double i) {
        double multi = 1;
        while (i > 0) {
            multi *= i--;
        }
            return multi;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ! " + ": " + fact(i));

        }
    }
}
