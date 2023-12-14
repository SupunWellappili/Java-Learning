package Controller.If;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        if (num == 1 | num == 2) {
            if (num == 1) {
                System.out.println("A");
            }
            System.out.println("B");
        } else {
            System.out.println("Wrong Number ");
        }
    }
}
