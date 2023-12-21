package Controller.For;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        if (num == 5 | num == 0) {
            System.out.print("[");
            if (num == 5) {
                System.out.print("0,1,2,3,4");
            } else {
                System.out.print("Wrong Number");
            }
            System.out.print("]");
        }
    }
}
