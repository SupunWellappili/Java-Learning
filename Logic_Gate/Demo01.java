
package Logic_Gate;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Mark 01 : ");
        int mark01 = input.nextInt();

        System.out.print("Enter Your Mark 02 : ");
        int mark02 = input.nextInt();

        if (mark01 >55 || mark02 < 80){
            System.out.println("Limit Set");
        }else {
            System.out.println("Not Set");
        }
    }
}






