package Array_Method_Passing;
import java.util.Arrays;

public class Demo10 {
    public static void incrementSalary(int[] s, double r) {
        for (int i = 0; i < s.length; i++) {
             s[i] = s[i]+ s[i]*10/100;
           // s[i] *= (r + 100) / 100;
        }
    }

    public static void main(String[] args) {
        int[] salary = {30000, 45000, 23000, 56000, 60000, 13000};
        System.out.println(Arrays.toString(salary));

        //incrementSalary by 10 %
        double rate = 10.0; //10%
        incrementSalary(salary, rate);

        System.out.println(Arrays.toString(salary));
    }
}
