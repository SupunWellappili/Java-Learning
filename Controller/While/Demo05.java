package Controller.While;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = 0;
        double tot = 0;

        do {
            tot += weight;
            System.out.print("Enter Chicken Weight KG -: ");
            weight = input.nextDouble();

        }
        while (weight != -1);
        System.out.print("Total Chicken KG -: " + tot);
    }
}
