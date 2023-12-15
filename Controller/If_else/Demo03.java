package Controller.If_else;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Score : ");
        int Grade = input.nextInt();

        if (Grade>74){
            System.out.println("A");
        } else if (Grade>64) {
            System.out.println("B");
        } else if (Grade>54) {
            System.out.println("C");
        } else if (Grade>34) {
            System.out.println("S");
        }else {
            System.out.println("F");
        }
    }
}
