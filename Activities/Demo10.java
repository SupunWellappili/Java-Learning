package Activities;

import java.util.Scanner;

public class Demo10 {

    public static boolean studentPass(int mark) {
        return mark >= 75;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Mark -: ");
        int mark = input.nextInt();

        if (studentPass(mark)) {
            System.out.println("You're PASSED");
        }else {
            System.out.println("Try Again Bro!!!");
        }
    }
}
