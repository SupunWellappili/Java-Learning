package Method;

import java.util.Scanner;

public class Demo02 {
    public static void printTotal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter You number 01 -: ");
        double num1 = input.nextDouble();

        System.out.print("Enter You number 02 -:");
        double num2 = input.nextDouble();

        double tot = 0;
        tot = num1 + num2;
        System.out.print("Total Value is -: "+tot);

    }

    public static void main(String[] args) {
        printTotal();
    }
}
