package Statements;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 5) { //After 5 break
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
