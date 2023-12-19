package Controller.Switch;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Number 01");
                break;

            case 2:
                System.out.println("Number 02");
                break;

            case 03:
                System.out.println("Number 03");
                break;

            case 04:
                System.out.println("Number 04");
                break;

            case 05:
                System.out.println("Number 05");
                break;

            case 06:
                System.out.println("Number 06");
                break;

            case 07:
                System.out.println("Number 07");
                break;

            default:
                System.out.println("Your Number is Wrong!");
        }
    }
}
