package Variable;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int x =500;
        System.out.println(x);
        int y;
        if (num>0){
            y =5000;
            System.out.println(y);
        }else {
            y = 2000;
            System.out.println(y);
        }
    }
}
