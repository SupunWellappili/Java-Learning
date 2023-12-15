package Controller.If;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter You Num 01: ");
        double num01 = input.nextDouble();

        System.out.print("Enter You Num 02: ");
        double num02 = input.nextDouble();

        System.out.print("Enter You Num 03: ");
        double num03 = input.nextDouble();

        System.out.print("Enter You Num 04: ");
        double num04 = input.nextDouble();

        System.out.print("Enter You Num 05: ");
        double num05 = input.nextDouble();

        double max = num01;
        if (max < num02) {
            max = num02;
        }

        if (max < num03) {
            max = num03;
        }

        if (max < num04) {
            max = num04;
        }

        if (max < num05) {
            max = num05;
        }

        System.out.println("Maximum Number is : " + max);


    }
}
