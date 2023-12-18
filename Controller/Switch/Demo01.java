package Controller.Switch;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Number 01");
        } else if (num == 2) {
            System.out.println("Number 02");
        } else if (num == 3) {
            System.out.println("Number 03");
        } else if (num == 4) {
            System.out.println("Number 04");
        } else if (num == 5) {
            System.out.println("Number 05");
        } else if (num == 6) {
            System.out.println("Number 06");
        } else {
            System.out.println("Oops!! Wrong Number");
        }

        System.out.println("-----------");

        switch (num) {
            case 11:
                System.out.println("Number 11");
                break;
            case 12:
                System.out.println("Number 12");
                break;
            case 13:
                System.out.println("Number 13");
                break;
            case 14:
                System.out.println("Number 14");
                break;
            case 15:
                System.out.println("Number 15");
                break;
            case 16:
                System.out.println("Number 16");
                break;
            default:
                System.out.println("Oops!!! My Capacity Overload");

        }
    }
}