package Activities;
import java.util.Scanner;

public class Demo02 {
    public static int revere(int num) {
        int rev = num %10;
        while ((num /=10)!=0){
            rev *=10;
            rev += num%10;
        }return rev;
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter Your Number :- ");
        int num = input.nextInt();

        int rev;
        rev = revere(num);
        System.out.println("Reverse number of : "+num+" ; "+rev);
    }
}
