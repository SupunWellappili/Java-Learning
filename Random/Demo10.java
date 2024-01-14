package Random;

import java.util.Random;

public class  Demo10 {
    public static void main(String[] args) {

          /*Random input = new Random();
        for(int i =0; i<100; i++){
            int no = input.nextInt(101);
            System.out.println("Random number is : "+no);
        }*/


        Random input = new Random();
        int no = input.nextInt(101);

        int i = 0;
        while (no != 100) {
            System.out.println("Random Number is : " + (i + 1) + ") " + no);
            no = input.nextInt(101);
            i++;
        }
        System.out.println("100 Random Number " + no);
          }
}
