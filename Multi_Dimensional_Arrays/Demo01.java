package Multi_Dimensional_Arrays;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int[][] x = new int[4][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Insert Number : ");


        x[0][0] = input.nextInt();
        x[0][1] = input.nextInt();
        x[0][2] = input.nextInt();

        x[1][0] = input.nextInt();
        x[1][1] = input.nextInt();
        x[1][2] = input.nextInt();

        x[2][0] = input.nextInt();
        x[2][1] = input.nextInt();
        x[2][2] = input.nextInt();

        x[3][0] = input.nextInt();
        x[3][1] = input.nextInt();
        x[3][2] = input.nextInt();
    }
}
