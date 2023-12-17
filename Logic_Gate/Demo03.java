package Logic_Gate;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        double num = input.nextDouble();

        if (num < 0) {
            num *= -1;
            System.out.println("Absolutely Number is -: " + num);
        } else {
            System.out.println("Absolutely Number is -: " + num);
        }
    }
}
