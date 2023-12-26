package Controller.While;

import java.util.Scanner;

public class Demo08 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        int no = input.nextInt();

        while (no != 0) {
            int dig = no%10;
            no /= 10;
            System.out.print(dig);
        }

    }
}