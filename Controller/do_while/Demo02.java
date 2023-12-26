package Controller.do_while;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random input = new Random();

        int count = 0;

        do {
            int odd = input.nextInt(100);
            if ((odd % 2) == 1) {
                System.out.println(count+") "+odd);
                count++;
            }
        } while (count<=150);
    }
}
