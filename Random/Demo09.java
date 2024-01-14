package Random;

import java.util.Random;

public class Demo09 {
    public static void main(String[] args) {
        Random input = new Random();

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt(2) + 150;
            System.out.println(num);
        }
    }
}
