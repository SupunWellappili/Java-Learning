import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num =input.nextInt();
        System.out.println("Your Number is :" +num);
        System.out.println();
        System.out.println("-----------------");
        System.out.println();
        System.out.print("Enter your Age :");
        double age = input.nextDouble();
        System.out.println("Your age is :"+age);
    }
}
