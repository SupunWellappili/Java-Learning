package Activities;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an Integer :");
        int num = input.nextInt();
        String sNum = num+"";
//integer,toString(num),String.valueOf(num)
        System.out.println(sNum.length());
    }
}
