package Static_Globle_Template;

public class Demo02 {
    static int x =123;
    public static void main(String[] args) {
        int x =678;
        System.out.println(x);//678
        System.out.println(Demo02.x);//123

    }
}
