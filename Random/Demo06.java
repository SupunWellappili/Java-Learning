package Random;

import java.util.Random;

public class Demo06 {
    public static void main(String[] args) {
        Random input = new Random();
        int num = 0;
        while (num != 99) {
            num = input.nextInt(100);
            System.out.println(num);
        }
    }
}
