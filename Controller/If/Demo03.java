package Controller.If;
import java.util.Scanner;

 public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary Count :- ");
        double salary = input.nextDouble();

        if (salary > 1000) {
            salary += 1000;
        }
        System.out.println("New Salary : " + salary);
    }
}
