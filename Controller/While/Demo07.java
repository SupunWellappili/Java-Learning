package Controller.While;

import java.util.Scanner;
public class Demo07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        int no = input.nextInt();

        int count =0;
        while (no !=0){
            no /= 10;
            count++;
        }
        System.out.print("Digit Count : "+count);
    }
}
