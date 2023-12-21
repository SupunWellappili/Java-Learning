package Controller.For;

import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num01 = input.nextInt();

        System.out.print("Enter Your Number : ");
        int num02 = input.nextInt();

        System.out.print("[");
        for (int i = num01; i <= num02; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(num02<num01 ? "Wrong Number]" : "\b\b]");
    }
}
