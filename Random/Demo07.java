package Random;

import java.util.Random;

public class Demo07 {
    public static void main(String[] args) {
        Random inut = new Random();
        int num=0;

        do {
            num = inut.nextInt(100);
            System.out.println(num);

        }while (num !=99);

    }
}
