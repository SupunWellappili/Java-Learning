package Activities;

public class Demo05 {
    public static int increment(int x){
         x =100;
        System.out.println("increment x: "+x);
        x++;
        System.out.println("increment x: "+x);
        return x;
    }
    public static void main(String[] args) {
        int x =100;
        System.out.println("main x: "+x);
        x =increment(x);
        System.out.println("main x: "+x);

    }
}
