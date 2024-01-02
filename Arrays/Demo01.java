package Arrays;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tot = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Your Number "+(i+1)+" --> ");
            int num = input.nextInt();
            tot += num;
        }
        System.out.println("Total is : " + tot);

    }


}
