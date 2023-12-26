package Controller.While;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num = input.nextInt();

        int count = Integer.toString(num).length();
        //Insert codes to find the no of digits for "num"

        System.out.print("Number of digit -: " + count);
    }
}
