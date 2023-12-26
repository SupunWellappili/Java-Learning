package Controller.While;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number -: ");
        int no =input.nextInt();

        int fact =1;
        while (no !=0){
            fact *= no;
            no--;
        }
            System.out.println(fact);
    }



}
