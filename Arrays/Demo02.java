package Arrays;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] xr = new int[10];

        System.out.print("Enter Your Number :");
        xr[0] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[1] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[2] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[3] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[4] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[5] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[6] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[7] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[8] = input.nextInt();
        System.out.print("Enter Your Number :");
        xr[9] = input.nextInt();


        int tot = 0;
        tot = xr[0] + xr[1] + xr[2] + xr[3] + xr[4] + xr[5] + xr[6] + xr[7] + xr[8] + xr[9];
        System.out.println("Result is : " + tot);


    }
}
