package Controller.Switch;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Month -: ");
        int month = input.nextInt();

        if (month==1 | month==3 | month==5 | month==7 | month==9 | month==11){
            System.out.println("31 Days");
        } else if (month == 4 | month == 6 | month==8 | month==10 | month==12) {
            System.out.println("30 Days");
        } else if (month==2) {
            System.out.println("28 Days");
        }else {
            System.out.println("Enter Wrong Month");
        }

    }
}
