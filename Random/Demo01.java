package Random;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random input = new Random();
        int num = input.nextInt();

        System.out.print("[");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+", ");
        }
        System.out.print("\b\b]");
    }
}
