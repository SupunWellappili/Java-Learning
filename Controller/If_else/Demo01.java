package Controller.If_else;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int mark = input.nextInt();

        if (mark>50){
            System.out.println("Your Pass!");
        }else {
            System.out.println("Your Fail");
        }

    }
}
