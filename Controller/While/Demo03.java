package Controller.While;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        Random input = new Random();
        int num = input.nextInt();

        while (num !=100){
            num = input.nextInt(101);
            System.out.println(num);
        }
    }
}
