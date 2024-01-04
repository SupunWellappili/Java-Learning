package Array_Method_Passing;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] ar ={12,13,14,15,16,17};
        String list = Arrays.toString(ar);
        System.out.println(list);//Legal
        System.out.println(Arrays.toString(ar));//Legal
    }
}
