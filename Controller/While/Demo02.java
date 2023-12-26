package Controller.While;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random input = new Random();
        int no =0;
        while (no!=100){
         no =input.nextInt(101);
            System.out.println(no);
        }
    }
}
