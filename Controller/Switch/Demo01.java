package Controller.Switch;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        if (num==1){
            System.out.println("Number 01");
        } else if (num==2) {
            System.out.println("Number 02");
        } else if (num==3) {
            System.out.println("Number 03");
        } else if (num==4) {
            System.out.println("Number 04");
        } else if (num==5) {
            System.out.println("Number 05");
        } else if (num==6) {
            System.out.println("Number 06");
        }else {
            System.out.println("Oops!! Wrong Number");
        }
    }
}