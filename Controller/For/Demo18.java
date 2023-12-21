package Controller.For;

import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        System.out.print("[");
        int tot =1;
        for (int i = 1; i <=num ; i++) {
            tot *= i;
            System.out.print(i+", ");
        }

        System.out.print("\b\b]"+" = "+tot);

    }
}
