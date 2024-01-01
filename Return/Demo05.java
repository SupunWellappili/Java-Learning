package Return;

import java.util.Scanner;

public class Demo05 {
    public static char findGrade(double avg) {
        if (avg > 74) {
            return 'A';
        } else if (avg > 64) {
            return 'B';
        } else if (avg > 54) {
            return 'C';
        } else if (avg > 34) {
            return 'S';
        }/* else {
            return 'F';
        }*/

        return 'F';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inter your Mark -: ");
        double point = input.nextInt();

        char grade = findGrade(point);
        System.out.println("Final Result : " + grade);
    }
}
