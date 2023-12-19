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
        System.out.println("------------------");

        switch (num){
            case 11:
                System.out.println("Number 11");break;
            case 12:
                System.out.println("Number 12");break;
            case 13:
                System.out.println("Number 13");break;
            case 14:
                System.out.println("Number 14"); break;
            case 15:
                System.out.println("Number 15");break;
            case 16:
                System.out.println("Number 16");break;
            case 17:
                    System.out.println("number 17");break;
        }
    }
}
