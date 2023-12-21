package Controller.For;

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();

        System.out.print("[");
        for (int i = num; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.print(num <= 0 ? "Empty]" : "\b\b]");

    }
}
