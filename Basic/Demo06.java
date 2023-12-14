package Basic;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Number 01: ");
        double num01 = input.nextDouble();

        System.out.print("Enter Your Number 02: ");
        double num02 =input.nextDouble();

        double tot = num02+num01;
        System.out.print("Your total mask is : "+tot);

        System.out.println("------------------");

        System.out.print("Enter You age: ");
        double nAge = input.nextInt();
        System.out.println("Your Age is: "+nAge);


        System.out.println("------------------");

        System.out.println("AB\nCD");
        System.out.println("AB\tCD");
        System.out.println("AB\fCD");
        System.out.println("AB\bCD");
        System.out.println("AB\rCD");
        System.out.println("AB\\CD");
        System.out.println("AB\"CD");
        //System.out.println("AB\wCD");
    }
}
