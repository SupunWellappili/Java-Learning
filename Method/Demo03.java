package Method;

import java.util.Scanner;

public class Demo03 {
    public static void printValue(double num01, double num02) {

        double tot = num01+num02;

        System.out.println("Total : "+tot);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your num 01 -: ");
        double num01 = input.nextDouble();

        System.out.print("Enter Your num 02 -: ");
        double num02 = input.nextDouble();

        printValue(num01,num02);
    }
}
