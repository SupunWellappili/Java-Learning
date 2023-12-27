package Activities;

import java.util.Scanner;

public class Demo01 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number -: ");
        int num = input.nextInt();

        int sum;
        sum=sumOfDigits(num);
        System.out.println("Sum Of Digits For -: "+num+" --> "+sum);
    }
}
