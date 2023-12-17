package Ternary;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number : ");

        int num = input.nextInt();
        System.out.println(num<0 ? -num : num);
    }
}
