package Random;

import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        Random input =new Random(100);
        System.out.print("[");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+", ");
        }
        System.out.print("\b\b]");
    }
}
