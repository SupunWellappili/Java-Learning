package Controller.If_else;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Allows : ");
        int allow = input.nextInt();

        if (allow>50){
            allow += 1000;
            System.out.println("New Allow :"+ allow);
        }else {
            allow +=4000;
            System.out.println("New Allow :"+allow);
        }


    }
}
