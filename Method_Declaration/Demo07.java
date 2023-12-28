package Method_Declaration;

import java.util.Scanner;

public class Demo07 {

    public static double pow(double x, double y) {
        double resutl = 1;
        for (int i = 0; i < y; i++) {
            resutl *= x;
        }
        return resutl;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number num01-: ");
        double num01 =input.nextDouble();

        System.out.print("Enter power Number num02-: ");
        double num02 =input.nextDouble();

        double p=pow(num01,num02);
        System.out.println("Result : "+num01+" * "+num02+" = "+p);
    }
}
