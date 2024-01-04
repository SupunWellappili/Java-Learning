package Array_Method_Passing;

public class Demo06 {
    public static void main(String[] args) {
        int[] ar = {12, 43, 54, 56, 44};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+", ");
        }
        System.out.println();
        System.out.println("---------------------");
        for (int n : ar
        ) {
            System.out.print(n+". ");
        }

    }
}
