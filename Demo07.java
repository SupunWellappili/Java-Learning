public class Demo07 {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        System.out.println(x + y + z);//60
        System.out.println("x" + "y" + "z");//xyz
        System.out.println("x+y" + z);//x+y30
        System.out.println("x" + y + z);//x2030 special
        System.out.println(x + y + "z");//30z
        System.out.println(x + "y" + z);//10y30

        int xx=100;
        int yy =200;

        System.out.println("x"+"+"+"y"+"="+(x+y));
        System.out.println("x"+"+"+"y"+"="+x+y);

        System.out.println("-------------------");

        System.out.println(xx+yy);//correct
        System.out.println(xx+ +yy);//correct
        //System.out.println(xx++yy);wrong
    }
}
