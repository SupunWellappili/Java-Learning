package Basic;

import java.util.Scanner;

class Demo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int tot = 0;
        while (num > 0) {
            System.out.print(num + " + ");
            tot += num--;
        }
        System.out.println("\b\b");
        System.out.println("Total Value is: " + tot);

    }
}
