package Ternary;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number : ");

        int num = input.nextInt();
        System.out.println(num<0 ? -num : num);

        Scanner out = new Scanner(System.in);
        System.out.print("Enter Your Salary Price : ");
        int salary = out.nextInt();

      //  salary = salary>=1000 ? salary + 200 : salary+500;
        salary += salary>=1000 ? 200 : 500;
        System.out.println(salary);
    }
}
