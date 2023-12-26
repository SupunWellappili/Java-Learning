package Controller.While;

import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        Random input = new Random();
        for ( int i = 0; i != 100;) {
            i = input.nextInt(101);
            System.out.println(i);
        }
    }
}
