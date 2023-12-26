package Controller.While;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Chicken Weight kg : ");
        double weight = input.nextDouble();
        double tot = 0;
        while (weight != -1) {

            tot += weight;
            System.out.print("Enter Chicken Weight kg : ");
            weight = input.nextDouble();

        }
        System.out.print("Total Chicken Weight kg : "+tot);

    }
}
