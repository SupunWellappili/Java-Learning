package Controller.If;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");

            if (num != 99) {
                System.out.println("D");
                System.out.println("E");
            }
            System.out.println("F");
            System.out.println("G");
        }
    }
}
