package Method;

import java.util.Random;

public class Demo05 {
    public static void  printReverse(int num) {
        do {
            int rev = num % 10;
            System.out.print( rev);
            num /= 10;
        } while (num != 0);
        System.out.println();

    }

    public static void main(String[] args) {
        Random input = new Random();

        for (int i = 0; i < 20; i++) {

            int num = input.nextInt(10000);
            System.out.println("Random Number is -: " + num);

            printReverse(num);


        }
    }
}
