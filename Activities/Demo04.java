package Activities;

public class Demo04 {

    public static void increment(){
        int x =100;
        System.out.println("increment x: "+x);
        x++;
        System.out.println("increment x: "+x);
    }
    public static void main(String[] args) {
        int x =100;
        System.out.println("main x: "+x);
        increment();
        System.out.println("main x: "+x);

    }
}
