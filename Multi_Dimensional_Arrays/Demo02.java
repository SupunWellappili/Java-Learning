package Multi_Dimensional_Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] ar;
        ar = new int[4];
        System.out.println(ar);
        System.out.println(0);

        System.out.println("/////////////////");

        int[][] br;
        br =new int[4][3];
        System.out.println(br);
        System.out.println(br[0]);
        System.out.println(br[0][0]);

        System.out.println("/////////////////");

        char[] cr;
        cr=new char[5];
        System.out.println(cr);
        System.out.println(cr[0]);
     //   System.out.println(cr[0][0]);

        int grade = cr[0];
        System.out.println(grade);
    }
}
