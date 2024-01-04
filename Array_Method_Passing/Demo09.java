package Array_Method_Passing;

import java.util.Arrays;

public class Demo09 {
    public static void main(String[] args) {
        int[] salary = {30000, 45000, 23000, 56000, 60000, 13000};
        System.out.println(Arrays.toString(salary));
        System.out.println("New Salary -: ");
        //increment Salary by 10%
        //Insert Code Here
        for (int i = 0; i < salary.length; i++) {
            salary[i] += salary[i] * 0.1;
            //salary[i] *= 1.1;

        }
        System.out.println(Arrays.toString(salary));
    }
}
