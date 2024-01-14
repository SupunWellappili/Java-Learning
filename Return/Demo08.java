package Return;

import java.util.Random;

public class Demo08 {
    public static void main(String[] args) {
        Random input = new Random();
        int i = input.nextInt();

        System.out.println("Start Game");
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("End Game");
    }
}
