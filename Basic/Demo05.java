public class Demo05 {
    public static void main(String[] args) {
       // int x,y,z;
        int x,y,z;
        x=y=z=100;
        System.out.println(x);//100
        System.out.println(y);//100
        System.out.println(z);//100
        System.out.println("--------");

        int xx=500,yy=1000;
        System.out.println(xx);
        System.out.println(yy);
        System.out.println("--------");

        xx=yy;
        System.out.println(xx);
        System.out.println(yy);
        System.out.println("--------");

        int zz;
        zz=xx+yy;
        System.out.println(zz);
        System.out.println("--------");

        int xxx=900;
        int yyy=2100;
        System.out.println("ABC"+"XYZ");
        System.out.println(100+200);
        System.out.println(xxx+"yyy");
        System.out.println("xxx"+yyy);
        System.out.println(xxx+yyy);
        System.out.println("xxx"+"yyy");

    }
}
