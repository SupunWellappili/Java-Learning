package Random;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Random input = new Random();
            int num = input.nextInt();

            System.out.println(num<0 ? -num : num);
        }
    }
}
