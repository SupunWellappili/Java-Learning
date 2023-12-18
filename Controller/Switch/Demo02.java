package Controller.Switch;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int no = input.nextInt();

        switch (no) {

            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
