package Controller.For;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        System.out.print("[");

        int tot =0;
        for (int i = 0; i < num; i++) {
            System.out.print(i+" + ");
            tot += i;

        }
        System.out.println("\b\b] ="+tot);
    }
}
