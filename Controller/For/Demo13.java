package Controller.For;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number 01: ");
        int num01 = input.nextInt();

        System.out.print("Enter your number 02 : ");
        int num02 = input.nextInt();

        System.out.print("[");
        for (int i = num01; i <num02 ; i++) {
            System.out.print(i+",");
        }

        System.out.println(num02<num01 ? "Wrong Number!!!]" : num02==num01 ? num01+"]":" \b\b]");


    }
}
