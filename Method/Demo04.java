package Method;

import java.util.Random;

public class Demo04 {

    public static void printDigitCount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
            System.out.println("Number count -: "+count);
        System.out.println();
    }


    public static void main(String[] args) {
        Random input = new Random();
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt(10000);
            System.out.println("Random number is -: " + number);
            printDigitCount(number);

        }

    }
}
