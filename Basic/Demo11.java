package Basic;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Price : ");
        int salary = input.nextInt();

        int count = salary / 5000;
        System.out.println("5000 :" + count);

        salary %= 5000;
        count = salary/2000;
        System.out.println("2000 :"+count );

        salary %= 2000;
        count = salary/1000;
        System.out.println("1000 :"+count );

        salary %= 1000;
        count = salary/500;
        System.out.println("500 :"+count );

        salary %= 500;
        count = salary/200;
        System.out.println("200 :"+count );

        salary %= 200;
        count = salary/100;
        System.out.println("1000 :"+count );

        salary %= 100;
        count = salary/50;
        System.out.println("50 :"+count );

        salary %= 50;
        count = salary/20;
        System.out.println("20 :"+count );

        salary %= 20;
        count = salary/10;
        System.out.println("10 :"+count );

        salary %= 10;
        count = salary/5;
        System.out.println("5 :"+count );

        salary %= 5;
        count = salary/2;
        System.out.println("2 :"+count );

        salary %= 2;
        count = salary/1;
        System.out.println("1 :"+count );
    }
}
