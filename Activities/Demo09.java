package Activities;

import java.util.Scanner;

public class Demo09 {
    public static char findGrade(double avg) {
        return (avg >= 75 ? 'A' : avg > 65 ? 'B' : avg >= 55 ? 'C' : avg >= 35 ? 'S' : 'F');
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Grade -: ");
        double avg = input.nextDouble();

        System.out.println("Result : "+findGrade(avg));
    }
}
