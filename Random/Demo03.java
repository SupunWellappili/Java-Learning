package Random;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            Random input = new Random();
            int num = input.nextInt();

            num = num < 0 ? -num : num;
            int abs = num % 100 + 1;

            System.out.println(i+1+") "+abs);


        }
    }
}
