package Statements;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number -: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            if (i ==10){
                continue;
            }
            System.out.println(i);

        }
    }
}
